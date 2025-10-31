package com.example.lib;
import Inheritance.Car;
import Inheritance.Vehicle;

public class MyClass {
    public static void main(String[] args){
        // print a message to the console

//        new MyClass().dataTypes();
//        new MyClass().operators();
//        new MyClass().string();
//        MyClass.staticMethod();
//        MyClass.whileMethod();
//        MyClass.forMethod();
//        MyClass.dataTypeArrayMethod();
//        MyClass.twoDimensionalArrayMethod();
//        MyClass.threeDimensionalArrayMethod();

        // 1）Inheritance and Polymorphism
        Car myCar = new Car(4, "Toyota");
        myCar.start(); // Inherited method from Vehicle class
        myCar.beep();  // Method from Car class

        // 2）Polymorphism: Vehicle reference but Car object
        Vehicle myCar2 = new Vehicle(4) {
            // 3）Abstraction: Override the abstract method
            @Override
            public void loadingQuantity() {
                System.out.println("Loading quantity:4 people");
            }
        };
        Vehicle myTrunk = new Vehicle(6) {
            @Override
            public void loadingQuantity() {
                System.out.println("Loading quantity:2 people");
            }
        };
        myCar2.start();
        myTrunk.start();
    }

    public static void twoDimensionalArrayMethod() {
        // Declare and initialize a 2D array
        // dataType [][] arrayName = { {row1}, {row2}, ... , {rowN} };
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access and print elements of the 2D array using nested for loops
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }

    public static void threeDimensionalArrayMethod() {
        int[][][] threeDimensionalArray = new int[1][22][33];
        threeDimensionalArray[0][1] = new int[99];
        threeDimensionalArray[0][1][1] = 100;


        for (int i = 0; i < threeDimensionalArray.length; i++) {
            for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                    System.out.print(threeDimensionalArray[i][j][k] + " ");
                }
                System.out.println(); // New line after each 2D slice
            }
            System.out.println(); // New line after each 3D slice
        }
    }

    public static void dataTypeArrayMethod() {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};
        // Or new way to declare and initialize an array
        int[] numbersArray = new int[5];
        // Store values in the array
        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;
        numbersArray[3] = 40;
        numbersArray[4] = 50;

        

        // Access and print array elements using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // for each loop to access array elements
        for (int num : numbers) {
            System.out.println("Array element: " + num);
        }
    }


    public static void forMethod() {
        // for( initialization; condition; increment ) { }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }

    public static void whileMethod() {
        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }
    }

    public static void switchMethod() {
        int day = 4;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day " + day + " is " + dayName);
    }


    public static void staticMethod() {
        int number = 8;
        if (number >= 9) {
            System.out.println("Number is greater than or equal to 9.");
        } else if (number < 7) {
            System.out.println("Number is less than or equal to 7.");
        } else {
            System.out.println("Number is less than 9.");
        }
    }


    public void string(){
        // Creating strings
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");
        System.out.println(str1);
        System.out.println("" + str2);
    }

    public void operators() {
        System.out.println("===  Operators  ===");

        int a = 9;
        int b = 22;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("b / a = " + (b / a)); // Division
        System.out.println("b % a = " + (b % a)); // Modulus

        // Increment and Decrement Operators
        int c = 5;
        System.out.println("c before increment: " + c);
        System.out.println("c after increment: " + (++c)); // Pre-increment
        System.out.println("c after decrement: " + (--c)); // Pre-decrement

        // Comparison Operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));           // Logical NOT
    }

    public void dataTypes() {
        System.out.println("===  Data Types  ===");

        /*
         * Primitive Data Types in Java
         */
        // byte: -128 --> 127
        byte x = 127;

        // short: -32,768 --> 32,767
        short y = 32_767;

        // int : -2,147,483,648 --> 2,147,483,647
        int z = 2_147_483_64;

        // long: -9,223,372,036,854,775,808 --> 9,223,372,036,854,775,807
        long a = 9_223_372_036_854_775_807L;
        long b = 100232342352234342l;

        // float: 32-bit IEEE 754 floating point
        // add "f" and "F" suffix to denote float literals
        float c = 5.75f;
        float pi = 3.14F;

        // double: 64-bit IEEE 754 floating point
        double pi2 = 3.141592653589793;
        double d = 19.99d;
        double e = 99.99; // default is double

        // boolean: true or false
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // char: single 16-bit Unicode character
        char letterA = 'A';
        char letterB = 66; // Unicode for 'B'
        char letterC = '\u0043'; // Unicode for 'C'
        char letterD = '\t'; // scape sequence for tab
        System.out.println("Character C: " + letterC);

        // Implicit type casting 隱式數據轉換，小數據轉換成大數據，數據沒丟失
        int numInt = 100;
        double numDouble = numInt; // automatic casting: int to double
        System.out.println("Integer value: " + numInt);
        System.out.println("Double value: " + numDouble);

        // Explicit type casting 顯式數據轉換，大數據轉換成小數據，數據可能丟失
        double pi3 = 3.1415926535;
        int piInt = (int) pi3; // manual casting: double to int
        System.out.println("Double value: " + pi3);
        System.out.println("Integer value after casting: " + piInt);

        // Type Casting between Different Data Types
        int myInt = 9;
        char myChar = (char) (myInt + 'A');
        System.out.println("myChar value: " + myChar);

        // Arithmetic Operations and Type Promotion
        byte byte1 = 40;
        byte byte2 = 50;

        // Operaters like +, -, *, / promote byte and short to int
        double doubleNum = 5.5%1.5;
        System.out.println("Result of 5.5 % 1.5: " + doubleNum);
    }

    public static void simplePrint(){
        System.out.println("This is a simple print method.");
        System.out.println("Hello from MyClass in com.example.lib");
        int age = 25;
        System.out.println("Normal shows age: " + age);
    }
}
