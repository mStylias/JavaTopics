package com.StyleM;

public class Main {

    public static void main(String[] args) {
        // Instantiate a car using the constructor and print it's fields
        Car car = new Car("Tesla", "Red", 250.0);
        System.out.println("The car model is: " + car.getModel());
        System.out.println("The car color is: " + car.getColor());
        System.out.println("The car max speed is: " + car.getMaxSpeed_KmH() + "km/h");

        // Create an instance of the CarColors singleton class to demonstrate the use
        // of a class with a private constructor
        CarColors carColors = CarColors.getInstance();
        System.out.println("\nThe available colors are:");
        for (String color : carColors.getAvailableColors()) {
            System.out.println(color);
        }
    }
}
