package com.StyleM;

// A class representing a very basic car
public class Car {
    // Private fields
    private String model;
    private String color;
    private double maxSpeed_KmH; // Measured in km/h

    // Getters - Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed_KmH() {
        return maxSpeed_KmH;
    }

    public void setMaxSpeed_KmH(double maxSpeed_KmH) {
        this.maxSpeed_KmH = maxSpeed_KmH;
    }

    // The most basic type of constructor that instantiates all the private fields
    public Car(String model, String color, double maxSpeed_KmH) {
        this.model = model;
        this.color = color;
        this.maxSpeed_KmH = maxSpeed_KmH;
    }

}
