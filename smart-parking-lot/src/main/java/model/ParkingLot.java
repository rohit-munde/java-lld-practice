package model;

import java.util.Set;

public class ParkingLot {
    private final String id;
    private String name;
    private Set<ParkingFloor> parkingFloors;

    public ParkingLot(String id, String name, Set<ParkingFloor> parkingFloors) {
        this.id = id;
        this.name = name;
        this.parkingFloors = parkingFloors;
    }

    public Set<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(Set<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", parkingFloors=" + parkingFloors +
                '}';
    }
}
