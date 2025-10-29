package com.example.lib;

public class MyClassFuction {

    // Methods - functions that perform specific tasks
    //         - behaviour of an object


    public static void main(String[] args){
        System.out.println("addNumbers:" + addNumbers(5, 10));          // Calls the int version
        System.out.println("addNumbersDouble:" +addNumbers(5.5, 10.5));      // Calls

    }

    static public int addNumbers(int a, int b) {
        return a + b;
    }

    static public double addNumbers(double a, double b) {
        return a + b;
    }
}
