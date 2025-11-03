package Inheritance;

// 3-2) Interface and Inheritance
// JAVA do not allow multiple inheritance,
// but we can implement multiple interfaces.
// public class Trunk extends Vehicle implements VehicleInterface, VehicleInterface2, VehicleInterface3{

public class Trunk extends Vehicle implements VehicleInterface{
    public Trunk(int wheels) {
        super(wheels);
    }

    @Override
    public void loadingQuantity() {
        System.out.println("Loading quantity:2 people and 1 tons.");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Trunk is ready to carry heavy loads!");
    }

    @Override
    public void startEngine() {
        System.out.println("Trunk is ready to start engine from VehicleInterface!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Trunk is stop engine from VehicleInterface!");
    }

    @Override
    public void accelerate() {
        System.out.println("Trunk is accelerating from VehicleInterface!");
    }

    @Override
    public void brake() {
        System.out.println("Trunk is braking from VehicleInterface!");
    }
}
