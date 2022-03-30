package com.StyleM;

public class Rectangle extends Shape implements IBasicShapeOperations {

    // Fields
    private double width;
    private double length;

    // Getters - Setters
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    // Constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the perimeter of the Rectangle
     * @return The rectangle perimeter
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    /**
     * Calculates the area of the Rectangle
     * @return The rectangle area
     */
    @Override
    public double calculateArea() {
        return width * length;
    }

    /**
     * Generates a string that contains the edges of the triangle
     * @return A string that contains the edges of the triangle
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The rectangle dimensions are:");
        stringBuilder.append("\nWidth: ");
        stringBuilder.append(getWidth());
        stringBuilder.append("\nLength: ");
        stringBuilder.append(getLength());
        return stringBuilder.toString();
    }
}
