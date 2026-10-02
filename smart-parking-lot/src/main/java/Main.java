import enums.ParkingSpotType;
import enums.VehicleType;
import model.*;
import service.ParkingService;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       ParkingLot parkingLot = new ParkingLot("PL-001", "Ash-lil Parking Lot", new HashSet<>());
       System.out.println("Welcome to " + parkingLot.getName());

       GenerateParkingLotInMemory(parkingLot);
       System.out.println("Parking lot initialized with floors: " + parkingLot.getParkingFloors().size());

       DisplayMenu();

       Scanner scanner = new Scanner(System.in);
       int option = scanner.nextInt();

       System.out.println("Option selected: " + option);
        while (option != 0) {
            switch (option) {
                case 1:
                    Vehicle vehicle;
                    System.out.println("Enter vehicle license plate number:");
                    String licensePlateNumber = scanner.next();
                    System.out.println("Enter vehicle type (CAR, BIKE, TRUCK):");
                    String vehicleTypeInput = scanner.next();
                    VehicleType vehicleType = VehicleType.valueOf(vehicleTypeInput.toUpperCase());
                    vehicle = new Vehicle(licensePlateNumber, vehicleType);
                    Ticket ticket = ParkingService.ParkVehicle(vehicle, parkingLot);
                    System.out.println(ticket.toString());
                    break;

                case 2:
                    System.out.println("Enter ticket ID to exit:");
                    Integer ticketId = scanner.nextInt();
                    Ticket ticket1 = ParkingService.UnParkVehicle(ticketId);
                    System.out.println(ticket1.toString());
                    System.out.println("Exited vehicle.");
                    break;
                case 3:
                    System.out.println(parkingLot.toString());
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
            DisplayMenu();
            option = scanner.nextInt();
        }
    }

    private static void DisplayMenu() {
        System.out.println("Choose an option");
        System.out.println("1. Park my vehicle");
        System.out.println("2. Exit vehicle");
        System.out.println("3. Display parking lot information");
        System.out.println("0. Exit");
    }

    private static void GenerateParkingLotInMemory(ParkingLot parkingLot) {
       ParkingSpot spotA1 = new ParkingSpot("A-1", ParkingSpotType.SMALL, true);
       ParkingSpot spotA2 = new ParkingSpot("A-2", ParkingSpotType.SMALL, false);
       ParkingSpot spotB1 = new ParkingSpot("B-1", ParkingSpotType.MEDIUM, true);
       ParkingSpot spotB2 = new ParkingSpot("B-2", ParkingSpotType.MEDIUM, false);
       ParkingSpot spotC1 = new ParkingSpot("C-1", ParkingSpotType.LARGE, true);

       Set<ParkingSpot> groundFloorSpots = new HashSet<>(List.of(spotA1, spotA2, spotB1, spotB2, spotC1));
       ParkingFloor groundFloor = new ParkingFloor("floor-1", 1, groundFloorSpots);

       ParkingSpot spotD1 = new ParkingSpot("D-1", ParkingSpotType.SMALL, false);
       ParkingSpot spotD2 = new ParkingSpot("D-2", ParkingSpotType.SMALL, true);
       ParkingSpot spotE1 = new ParkingSpot("E-1", ParkingSpotType.MEDIUM, true);
       ParkingSpot spotE2 = new ParkingSpot("E-2", ParkingSpotType.MEDIUM, false);

       Set<ParkingSpot> firstFloorSpots = new HashSet<>(List.of(spotD1, spotD2, spotE1, spotE2));
       ParkingFloor firstFloor = new ParkingFloor("floor-2", 2, firstFloorSpots);

       Set<ParkingFloor> floors = new HashSet<>(List.of(groundFloor, firstFloor));
       parkingLot.setParkingFloors(floors);

       System.out.println("Dummy parking lot generated:");
       System.out.println("Floor count: " + parkingLot.getParkingFloors().size());
       System.out.println("Total spots: " + parkingLot.getParkingFloors().stream()
               .mapToInt(floor -> floor.getParkingSpots().size())
               .sum());
    }
}