package Inheritance;

// Parent class
public class Car extends Vehicle {
    String carModel; // default access


    public Car(int wheels, String model) {
        super(6);
        this.carModel = model;
    }

    public void beep() {
        if (isStarted) {
            System.out.println("Car " + carModel + " is beeping!");
            System.out.println("Beep! Beep!");
        } else {
            System.out.println("Start the car to beep.");
        }
    }

    public void honk() {
        if (isStarted) {
            System.out.println("Car " + carModel + " is honking!");
            System.out.println("Honk! Honk!");
        } else {
            System.out.println("Start the car to honk.");
        }
    }

    @Override
    void loadingQuantity() {
        System.out.println("Loading quantity:4 people");
    }

    @Override
    public void start() {
        super.start();
        honk();
    }
}
