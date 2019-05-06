package oopTask.typeOfTransport;

import oopTask.fuelAndVehicle.FuelVehicle;

public abstract class Car extends WheelVehicle implements FuelVehicle {

    private boolean fuelAvailability;

    public Car() {
        super(4);
    }

    public boolean isFuelAvailability() {
        return fuelAvailability;
    }

    public void setFuelAvailability(boolean fuelAvailability) {
        this.fuelAvailability = fuelAvailability;
    }


    public void move() {
        System.out.println("Car is moving with " + getGearCount() + " gears");
    }

    public void fuel() {
        if (fuelAvailability) {
            System.out.println("Car have fuel ");
        } else {
            System.out.println("Car don't have fuel");
        }
    }
}