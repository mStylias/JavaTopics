package com.StyleM;

// A class representing a very basic car
public class Car {
    // Private fields
    private final String model;
    private final String color;
    private final double maxSpeed_KmH; // Measured in km/h
    private Engine engine;

    // Getters - Setters
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public double getMaxSpeed_KmH() {
        return maxSpeed_KmH;
    }
    public Engine getEngine() { return engine; }


    // The most basic type of constructor that instantiates all the private fields
    public Car(String model, String color, double maxSpeed_KmH) {
        this.model = model;
        this.color = color;
        this.maxSpeed_KmH = maxSpeed_KmH;
    }

    // Constructor with engine
    public Car(String model, String color, double maxSpeed_KmH, double horsePower, String type) {
        this.model = model;
        this.color = color;
        this.maxSpeed_KmH = maxSpeed_KmH;
        engine = new Engine(horsePower, type);
    }

    // The engine of the car
    // This is an inner (or nested) class
    public class Engine {
        public Engine(double horsePower, String type) {
            this.horsePower = horsePower;
            this.type = type;
        }

        // Fields
        private double horsePower;
        private String type;

        // Getters
        public double getHorsePower() {
            return horsePower;
        }

        public String getType() {
            return type;
        }

        // Method that uses a local inner class
        public String calculateEnvironmentalImpact() {
            class ImpactCalculator {
                private String calculateDieselImpact() {
                    // Business logic
                    return "High";
                }

                private String calculateElectricityImpact() {
                    // Business logic
                    return "Low";
                }

                public String getImpactByType(String type) {
                    switch (type) {
                        case "Diesel":
                            return calculateDieselImpact();
                        case "Electricity":
                            return calculateElectricityImpact();
                        default:
                            return "The type is not recognized";
                    }
                }
            }

            ImpactCalculator impactCalculator = new ImpactCalculator();
            return impactCalculator.getImpactByType(type);
        }
    }
}
