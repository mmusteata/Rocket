package oopTask.Main;

import oopTask.transport.DaciaLogan;
import oopTask.transport.MountainBike;

public class Driver {

    public static void main(String[] args) {
        MountainBike bike = new MountainBike();
        DaciaLogan dacia = new DaciaLogan();

        dacia.setGearCount(4);
        dacia.setFuelAvailability(true);
        dacia.fuel();
        dacia.move();

        bike.setCurrentGear(7);
        bike.move();
    }
}
