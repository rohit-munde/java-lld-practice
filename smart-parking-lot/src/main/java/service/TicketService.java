package service;

import model.ParkingSpot;
import model.Ticket;
import model.Vehicle;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TicketService {
private static final Map<Integer, Ticket> ticketMap = new HashMap<>();
    public static Ticket GenerateTicket(Vehicle vehicle, ParkingSpot availableSpot){
        Ticket ticket = new Ticket(vehicle, availableSpot);
        ticketMap.put(ticket.getTicketId(), ticket);
        return ticket;
    }

    public static Ticket getTicketById(Integer ticketId) {
        return ticketMap.get(ticketId);
    }
}
