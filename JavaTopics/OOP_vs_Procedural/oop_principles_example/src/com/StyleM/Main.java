package com.StyleM;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // The following example demonstrates polymorphism
        Triangle triangle1 = new Triangle(10, 15, 15);
        Triangle triangle2 = new Triangle(15, 20, 10);
        Rectangle rectangle1 = new Rectangle(20, 25);
        Rectangle rectangle2 = new Rectangle(15, 30);

        // Add all the shapes in one array list
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(triangle1);
        shapes.add(triangle2);
        shapes.add(rectangle1);
        shapes.add(rectangle2);

        // Show the unique characteristics of each shape along with their
        // respective perimeter and area
        for (Shape shape : shapes) {
            System.out.println("-------------------------------------------");
            System.out.println(shape.toString());

            // Here we can leverage the power of interfaces in order to
            // print the shape perimeter and area only if the given shape
            // supports this operation. In this case all the shapes implement
            // the IBasicShapeOperations interface so the if statement is
            // pointless, but if we had a shape that doesn't,
            // this statement would be meaningful
            if (shape instanceof IBasicShapeOperations) {
                System.out.println("\nShape perimeter: " + shape.getPerimeter());
                System.out.println("Shape area: " + shape.getArea());
            }
        }
    }
}
