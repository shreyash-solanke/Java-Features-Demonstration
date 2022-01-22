package com.demo.Inheritance;

/**
 * This is Circle class which implements Shape inheritance and defines the Circle shape.
 * @author Shreyash Solunke
 * @version 1.0.0
 */
public class Circle implements Shape {

    private double radius;

    /**
     * Create new Circle shape.
     * @param radius - Radius of the Circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @see Shape
     * @return Area of circle - PI * r * r;
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * @see Shape
     * @return Circumference of circle - 2 * PI * radius
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * @see Shape
     * Prints Length and Breadth of the rectangle
     */
    @Override
    public void printProperties() {
        System.out.println("This is a circle with [Radius - " + this.radius + "]");
    }

    /**
     * @see Shape
     * @return String - "Circle"
     */
    @Override
    public String getShapeName() {
        return "Circle";
    }
}
