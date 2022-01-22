package com.demo.Inheritance;

/**
 * This is Shape interface which defines generic shape blueprint.
 */
public interface Shape {

    /**
     * This method calculates area of the shape.
     * @return Area of the shape with double data type
     */
    double calculateArea();

    /**
     * This method calculates perimeter of the shape.
     * @return Area of the shape with double data type
     */
    double calculatePerimeter();

    /**
     * This method prints the properties of the shape.
     */
    void printProperties();

    /**
     * This method returns the shape of the name.
     * @return Name of the shape
     */
    String getShapeName();

}
