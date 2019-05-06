package oopTask.typeOfTransport;

public abstract class Bike extends WheelVehicle {

    private int wheelDiameter;

    public Bike() {
    }

    public Bike(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

}
