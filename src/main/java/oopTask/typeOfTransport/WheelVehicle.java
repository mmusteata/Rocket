package oopTask.typeOfTransport;

import oopTask.fuelAndVehicle.Vehicle;

public abstract class WheelVehicle implements Vehicle {

    private int wheelCount;
    private int distance;
    private int gearCount;
    private int currentGear;

    public WheelVehicle() {
    }

    public WheelVehicle(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public WheelVehicle(int wheelCount, int gearCount) {
        this.wheelCount = wheelCount;
        this.gearCount = gearCount;
    }

    public WheelVehicle(int wheelCount, int gearCount, int distance) {
        this.wheelCount = wheelCount;
        this.gearCount = gearCount;
        this.distance = distance;
    }

    public WheelVehicle(int wheelCount, int gearCount, int distance, int currentGear) {
        this.wheelCount = wheelCount;
        this.gearCount = gearCount;
        this.distance = distance;
        this.currentGear = currentGear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public void move(int currentGear) {
        System.out.println("Moving with" + getCurrentGear());
    }
}