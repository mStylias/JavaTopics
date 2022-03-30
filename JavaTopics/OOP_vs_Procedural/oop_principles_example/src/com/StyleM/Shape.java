package com.StyleM;

public class Shape implements IBasicShapeOperations {

    // Fields
    private double opacity;
    private double perimeter;
    private double area;

    // Getters - Setters
    public double getOpacity() {
        return opacity;
    }
    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }

    public double getArea() {
        return calculateArea();
    }

    public double getPerimeter() {
        return calculatePerimeter();
    }

    /**
     * Calculates the perimeter of a shape
     * @return The perimeter of the shape if it exists or -1 if not
     */
    public double calculatePerimeter() {
        return -1;
    }

    /**
     * Calculates the area of a shape
     * @return The area of the shape if exists or -1 if not
     */
    public double calculateArea() {
        return -1;
    }

    @Override
    public String toString() {
        return "Just a general shape";
    }
}
