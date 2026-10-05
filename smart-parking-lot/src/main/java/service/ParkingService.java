package service;

import model.ParkingLot;
import model.ParkingSpot;
import model.Ticket;
import model.Vehicle;

import java.time.LocalDateTime;

public class ParkingService {
   public static Ticket ParkVehicle(Vehicle vehicle, ParkingLot parkingLot) {
       ParkingSpot availableSpot = SpotAllocationService.FindAvailableSpot(vehicle, parkingLot);
       synchronized (availableSpot) {
           if(!availableSpot.isAvailable()) {
               throw new RuntimeException("Parking spot is not available");
           }
           availableSpot.setVehicle(vehicle);
           availableSpot.setAvailable(false);
            return TicketService.GenerateTicket(vehicle, availableSpot);
       }
   }

   public static Ticket UnParkVehicle(Integer ticketId) {
       Ticket ticket = TicketService.getTicketById(ticketId);

       if(ticket == null) {
           throw new RuntimeException("Ticket not found");
       }

       ParkingSpot parkingSpot = ticket.getParkingSpot();
       parkingSpot.setAvailable(true);

       ticket.setExitTime(LocalDateTime.now());

       PaymentService.Pay(ticket);
       return ticket;
    }
}
