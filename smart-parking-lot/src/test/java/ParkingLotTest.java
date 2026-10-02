import enums.ParkingSpotType;
import enums.VehicleType;
import model.ParkingFloor;
import model.ParkingLot;
import model.ParkingSpot;
import model.Ticket;
import model.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.ParkingService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    private ParkingLot parkingLot;

    @BeforeEach
    void setUp() {
        ParkingSpot spot1 = new ParkingSpot("A-1", ParkingSpotType.MEDIUM, true);
        ParkingSpot spot2 = new ParkingSpot("B-1", ParkingSpotType.LARGE, true);

        Set<ParkingSpot> floorSpots = new HashSet<>(List.of(spot1, spot2));
        ParkingFloor floor = new ParkingFloor("floor-1", 1, floorSpots);

        parkingLot = new ParkingLot("PL-TEST", "Test Parking Lot", new HashSet<>(List.of(floor)));
    }

    @Test
    void testParkAndUnparkVehicle() {
        Vehicle car = new Vehicle("MH12AB1234", VehicleType.CAR);
        Ticket ticket = ParkingService.ParkVehicle(car, parkingLot);

        assertNotNull(ticket);
        assertNotNull(ticket.getTicketId());
        assertEquals("MH12AB1234", ticket.getVehicle().getLicensePlatNo());
        assertFalse(ticket.getParkingSpot().isAvailable());

        Ticket unparkedTicket = ParkingService.UnParkVehicle(ticket.getTicketId());
        assertNotNull(unparkedTicket.getExitTime());
        assertTrue(unparkedTicket.getParkingSpot().isAvailable());
    }
}
