package model;

import enums.VehicleType;

public class Vehicle {
    private String licensePlatNo;
    private VehicleType vehicleType;

    public Vehicle(String licensePlatNo, VehicleType vehicleType) {
        this.licensePlatNo = licensePlatNo;
        this.vehicleType = vehicleType;
    }

    public String getLicensePlatNo() {
        return licensePlatNo;
    }

    public void setLicensePlatNo(String licensePlatNo) {
        this.licensePlatNo = licensePlatNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlatNo='" + licensePlatNo + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
