package model;

import utils.IdGenerator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private Integer ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(Integer ticketId, Vehicle vehicle, ParkingSpot parkingSpot, LocalDateTime entryTime, LocalDateTime exitTime) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public Ticket(Vehicle vehicle, ParkingSpot availableSpot) {
        this.ticketId = IdGenerator.generateTicketId();
        this.vehicle = vehicle;
        this.parkingSpot = availableSpot;
        this.entryTime = LocalDateTime.now();
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

//    public double calculateParkingDuration() {
//        if (entryTime != null && exitTime != null) {
//            return between(entryTime, exitTime).toMinutes();
//        }
//        return 0;
//    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", vehicle=" + (vehicle != null ? vehicle.getLicensePlatNo() + " (" + vehicle.getVehicleType() + ")" : "null") +
                ", parkingSpot=" + (parkingSpot != null ? parkingSpot.getSpotId() : "null") +
                ", entryTime=" + entryTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) +
                ", exitTime=" + (exitTime != null ? exitTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) : "null") +
                '}';
    }
}
