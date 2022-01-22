package com.demo.Inheritance;

/**
 * This is Rectangle class which implements Shape inheritance and defines the Rectangle shape.
 */
public class Rectangle implements Shape{

    private double length;
    private double breadth;

    /**
     * Create new Circle shape.
     * @param length - Length of the rectangle
     * @param breadth - Breadth of the rectangle
     */
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    };

    /**
     * @see Shape
     * @return Area of rectangle - length * breadth
     */
    @Override
    public double calculateArea() {
        return length * breadth;
    }

    /**
     * @see Shape
     * @return Perimeter of rectangle - 2 * (length + breadth)
     */
    @Override
    public double calculatePerimeter() {
        return 2*(length+breadth);
    }

    /**
     * @see Shape
     * Prints Length and Breadth of the rectangle
     */
    @Override
    public void printProperties() {
        System.out.println("This is a rectangle with [Length - " + this.length + " and Breadth - " + this.breadth + "]");

    }

    /**
     * @see Shape
     * @return String - "Rectangle"
     */
    @Override
    public String getShapeName() {
        return "Rectangle";
    }
}
