package com.example.lib;

public class MyCar {
    // Attributes - properties of an object
    //            - private, public, protected
    // private: accessible only within the class
    private String engine = "V8";

    // protected: accessible within the class and its subclasses and package
    protected  String driver = "John Doe";


    // public
    String color = "Red";
    String bands = "Toyota";

    Double speed = 0.0;
    Double maxSpeed = 160.0;

    public MyCar(String color, String bands, Double maxSpeed) {
        this.color = color;
        this.bands = bands;
        this.maxSpeed = maxSpeed;
        displayInfo();
    }

    public void displayInfo() {
        System.out.println("Car Color: " + color);
        System.out.println("Car Bands: " + bands);
        System.out.println("Car Speed: " + speed);
    }

//    public static void main(String[] args) {
//        Car myCar = new Car("Blue", "Honda");
//    }

    public void brake() {
        if (speed > 10) {
            speed -= 10;
        } else {
            speed = 0.0;
        }
        System.out.println("The car is braking.");
    }

    public void accelerate() {
        if (speed + 10 <= maxSpeed) {
            speed += 10;
        } else {
            speed = maxSpeed;
        }
        System.out.println("The car is accelerating.");
    }

}
