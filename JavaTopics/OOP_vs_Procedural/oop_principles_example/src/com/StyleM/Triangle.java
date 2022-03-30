package com.StyleM;

public class Triangle extends Shape implements IBasicShapeOperations {

    // Fields
    private double baseEdge;
    private double edge2;
    private double edge3;

    // Getters - Setters
    public double getBaseEdge() {
        return baseEdge;
    }
    public double getEdge2() {
        return edge2;
    }
    public double getEdge3() {
        return edge3;
    }
    public void setBaseEdge(double baseEdge) {
        this.baseEdge = baseEdge;
    }
    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }
    public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }

    // Constructors
    public Triangle(double baseEdge, double edge2, double edge3) {
        this.baseEdge = baseEdge;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    // Methods
    /**
     * Calculates the perimeter of the triangle
     * @return The perimeter of the triangle
     */
    @Override
    public double calculatePerimeter() {
        return baseEdge + edge2 + edge3;
    }

    /**
     * Calculates the area of the triangle using
     * Heron's formula
     * @return The area of the triangle
     */
    @Override
    public double calculateArea() {
        double s = getPerimeter()/2; // Semi perimeter
        return Math.sqrt(s * (s-baseEdge) * (s-edge2) * (s-edge3));
    }

    /**
     * Generates a string that contains the edges of the triangle
     * @return A string that contains the edges of the triangle
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The Triangle edges are:");
        stringBuilder.append("\nBase edge: ");
        stringBuilder.append(getBaseEdge());
        stringBuilder.append("\nEdge 2: ");
        stringBuilder.append(getEdge2());
        stringBuilder.append("\nEdge 3: ");
        stringBuilder.append(getEdge3());
        return stringBuilder.toString();
    }
}
