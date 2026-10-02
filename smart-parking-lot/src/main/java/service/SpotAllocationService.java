package service;

import model.ParkingFloor;
import model.ParkingLot;
import model.ParkingSpot;
import model.Vehicle;

public class SpotAllocationService {
    /*
    * ParkingSpot FindAvailableSpot(Vehicle vehicle)
    */

    public SpotAllocationService() {
    }

    public static ParkingSpot FindAvailableSpot(Vehicle vehicle, ParkingLot parkingLot) {
        // Implement logic to find an available parking spot based on the vehicle type
        // For example, you can check the parking lot's data structure to find a suitable spot
        // Return the available ParkingSpot object or null if no spot is available

        for(ParkingFloor floor : parkingLot.getParkingFloors()) {
            for(ParkingSpot spot : floor.getParkingSpots()) {
                if(spot.isAvailable()) {
                    return spot;
                }
            }
        }
        throw new RuntimeException("No available spot found");
    }
}
