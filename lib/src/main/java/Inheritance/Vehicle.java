package Inheritance;

public abstract class Vehicle {
    int numberOfWheels; // default access
    boolean isStarted; // default access

    // Constructor
    public Vehicle(int wheels) {
        this.numberOfWheels = wheels;
    }

    // 3-1 ）Abstraction - abstract method
    //             - abstract class
    /**
    abstract class SuperCar extends Vehicle {
        // 不實作 loadingQuantity() 也可以，因為 SuperCar 也是抽象類別
    }
     */
    abstract void loadingQuantity();

    public void start() {
        isStarted = true;
        System.out.println("Vehicle is starting with " + numberOfWheels + " wheels.");
    }

    public void stop() {
        isStarted = false;
        System.out.println("Vehicle is stopping.");
    }
}
