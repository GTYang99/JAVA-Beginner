package Inheritance;

public class Vehicle {
    int numberOfWheels; // default access
    boolean isStarted; // default access

    public Vehicle(int wheels) {
        this.numberOfWheels = wheels;
    }

    public void start() {
        isStarted = true;
        System.out.println("Vehicle is starting with " + numberOfWheels + " wheels.");
    }

    public void stop() {
        isStarted = false;
        System.out.println("Vehicle is stopping.");
    }
}
