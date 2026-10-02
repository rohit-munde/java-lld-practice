package model;

import java.util.Set;

public class ParkingFloor {
    private String id;
    private Integer floorNo;
    private Set<ParkingSpot> parkingSpots;

    public ParkingFloor(String id, Integer floorNo, Set<ParkingSpot> parkingSpots) {
        this.id = id;
        this.floorNo = floorNo;
        this.parkingSpots = parkingSpots;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(Integer floorNo) {
        this.floorNo = floorNo;
    }

    public Set<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(Set<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    @Override
    public String toString() {
        return "ParkingFloor{" +
                "id='" + id + '\'' +
                ", ParkingSpot=" + parkingSpots +
                '}';
    }
}
