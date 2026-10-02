package model;

import enums.ParkingSpotType;

public class ParkingSpot {
    private String spotId;
    private ParkingSpotType parkingSpotType;
    private Boolean isAvailable;
    private Vehicle vehicle;

    public ParkingSpot(String spotId, ParkingSpotType parkingSpotType, Boolean isAvailable) {
        this.spotId = spotId;
        this.parkingSpotType = parkingSpotType;
        this.isAvailable = isAvailable;
    }

    public ParkingSpot(String spotId, ParkingSpotType parkingSpotType, Boolean isAvailable, Vehicle vehicle) {
        this.spotId = spotId;
        this.parkingSpotType = parkingSpotType;
        this.isAvailable = isAvailable;
        this.vehicle = vehicle;
    }

    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public Boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotId='" + spotId + '\'' +
                ", parkingSpotType=" + parkingSpotType +
                ", isAvailable=" + isAvailable +
                ", vehicle=" + vehicle +
                '}';
    }
}
