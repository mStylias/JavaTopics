package com.StyleM;

// Used to demonstrate the anonymous inner class
abstract class AnonymousInner {
    public abstract void locateMethod();
}

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

        // Create a car with an engine to demonstrate the nested class: Engine
        Car carWithEngine = new Car("Ford", "White", 200,250, "Diesel");
        System.out.println("\nThe engine's horsepower is " + carWithEngine.getEngine().getHorsePower());
        System.out.println("The engine's environmental impact is " +
            carWithEngine.getEngine().calculateEnvironmentalImpact());

        // Create an anonymous inner class
        AnonymousInner inner = new AnonymousInner() {
            @Override
            public void locateMethod() {
                System.out.println("\nThis is from the AnonymousInner class");
            }
        };
        inner.locateMethod();
    }
}
