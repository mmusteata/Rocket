package oopTask.transport;

import oopTask.typeOfTransport.Bike;

public class MountainBike extends Bike {

    public MountainBike() {
        setWheelCount(2);
        setWheelDiameter(26);
        setGearCount(24);
    }
    public void move() {
        System.out.println("Bike is moving with " + getWheelCount() + " wheels");
        System.out.println("Bike is moving with " + getCurrentGear() + " gears");
    }
}
