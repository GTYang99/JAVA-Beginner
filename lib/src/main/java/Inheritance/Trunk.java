package Inheritance;

// 3-2) Interface and Inheritance
public class Trunk extends Vehicle implements VehicleInterface{
    public Trunk(int wheels) {
        super(wheels);
    }

    @Override
    void loadingQuantity() {
        System.out.println("Loading quantity:2 people and 1 tons.");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Trunk is ready to carry heavy loads!");
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void brake() {

    }
}
