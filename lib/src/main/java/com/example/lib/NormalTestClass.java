package com.example.lib;

public class NormalTestClass {
    void tester() {

        MyCar newCar = new MyCar("Blue", "Honda", 180.0);
        
        // The class private field 'engine' is not accessible here.
//        newCar.engine = "V6";

        // also protected field 'color' is accessible here.
        newCar.driver = "Alice";
    }
}
