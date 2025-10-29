package Inheritance;

public class Trunk extends Vehicle {
    public Trunk(int wheels) {
        super(wheels);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Trunk is ready to carry heavy loads!");
    }
}
