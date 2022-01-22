package com.demo;

import com.demo.GreatestCommonDivisor.*;
import com.demo.Inheritance.*;
import com.demo.Generics.*;
import com.demo.ObjectComparision.Student;


/**
 * This is the main entry point to the given IPConfigure assessment.
 * This contains the main method of the application.
 *
 * @author Shreyash Solunke
 * @version 1.0.0
 * Date: January 8, 2022
 */
public class IPConfigureMain {

    /**
     * This method demonstrates Polymorphism by interface. We can pass both rectangle and circle object to this method
     * and depending on the Object passed, this method will call appropriate subclass method.
     *
     * @see Shape
     * @param s - Object of class which implements Shape interface, it can be Rectangle or Circle Object.
     */
    public static void demoInheritance(Shape s) {
        //Depending on the object passed, this method will print different shape details
        s.printProperties();
        System.out.println("Area of " + s.getShapeName() + " - " + s.calculateArea());
        System.out.println("Perimeter of " + s.getShapeName() + " - " + s.calculatePerimeter());
    }

    /**
     * This method demonstrates how to use Generics in java.
     * Generics enable us to achieve strong type checking and code reuse
     * In this method, MinMaxFinder extends an abstract class with Generic interface implementation.
     * So we define data type at compile time and Run time ClassCastException is avoided.
     * Also, minValue() and maxValue() methods are defined using Generic Interface which helps us
     * use same code for different data types.
     * @see MinMaxMidFinder
     * @see MinMaxImpl
     * @see MinMaxInterface
     */
    public static void demoGenerics() {

        Integer intArray[] = {13, 36, 22, 18, 26};
        Character charArray[] = {'S', 's', 'V', 'w', 'p', 'R'};
        Employee e1 = new Employee(131, "Bob", "Builder");
        Employee e2 = new Employee(1111, "Elong", "Must");
        Employee e3 = new Employee(643, "Bill", "Desk");
        Employee empArr[] = {e1, e2, e3};

        //this demonstrates Strong type checking as Object with same type can only be passed while Object creation
        MinMaxMidFinder<Integer> a = new MinMaxMidFinder<>(intArray);
        MinMaxMidFinder<Character> b = new MinMaxMidFinder<>(charArray);
        MinMaxMidFinder<Employee> e = new MinMaxMidFinder<>(empArr);

        //this demonstrates code reuse as same code is used for finding min, max and mid values of different object types
        System.out.println("Integers :: Min - " + a.minValue() + " Max - " + a.maxValue() + " Mid - " + a.getMidElement());
        System.out.println("Characters:: Min - " + b.minValue() + " Max - " + b.maxValue() + " Mid - " + b.getMidElement());
        System.out.println("Employees:: Min - " + e.minValue() + " Max - " + e.maxValue() + " Mid - " + e.getMidElement());

    }

    /**
     * This method demonstrates two types of object comparisons.
     * Object comparison by reference is achieved by "=" operation. By default,
     * it compares the object reference (by checking object memory location)
     * Object comparison by value compares the member variable values of the object.
     * We override the "equals()" method and implement our custom object equality definition.
     * In below method we show different cases of object comparison.
     * @see Student
     */
    public static void demoObjectComparison() {


        Student s1 = new Student(131, "Bob", "Builder");
        Student s2 = new Student(131, "Bob", "Builder");
        Student s3 = s1;

        if (s1 == s2) {
            System.out.println("s1:s2 -> Checking by reference -> s1 and s2 objects are similar!");
        } else {
            System.out.println("s1:s2 -> Checking by reference -> s1 and s2 objects are different!");
        }
        if (s1.equals(s2)) {
            System.out.println("s1:s2 -> Checking by value -> s1 and s2 objects are similar!");
        } else {
            System.out.println("s1:s2 -> Checking by value -> s1 and s2 objects are different!");
        }

        if (s1 == s3) {
            System.out.println("s1:s3 -> Checking by reference -> s1 and s3 objects are similar!");
        } else {
            System.out.println("s1:s3 -> Checking by reference -> s1 and s3 objects are different!");
        }
        if (s1.equals(s2)) {
            System.out.println("s1:s3 -> Checking by value -> s1 and s3 objects are similar!");
        } else {
            System.out.println("s1:s3 -> Checking by value -> s1 and s3 objects are different!");
        }

    }

    /**
     * This method demonstrates concurrent thread execution to calculate GCD of two numbers.
     * This method reads InputFile.txt from resources to get 10000 pair of numbers and store
     * that in the list using getInputDatafromFile() method.
     * @see GCDProcessor
     * The handleList() method accepts the number of threads as parameter and launches Run method.
     * Each thread runs lambda expression which calculates the GCD.
     * It waits for all threads to finish and displayes total computed time.
     * @see CalcThread
     * @see IntegerPair
     */
    public static void demoConcurrency() {
        GCDProcessor processor = new GCDProcessor();

        //first read data from the file
        processor.getInputDatafromFile();

        //launch 8 threads and calculate total time taken to run after waiting for processes to finish
        long start2 = System.currentTimeMillis();
        processor.handleList(8);
        long end2 = System.currentTimeMillis();
        System.out.println("Concurrent Elapsed Time in milli seconds: " + (end2 - start2));
    }

    /**
     * Main function - Entrypoint - of the application
     * Shows different demonstrations required for the assessment
     *
     * @param args - Command line arguments
     */
    public static void main(String[] args) {


        //Polymorphism Demonstration
        System.out.println("Polymorphism Demonstration\n");
        Rectangle rect = new Rectangle(10.0, 15.0);
        Circle circle = new Circle(5.5);
        demoInheritance(rect);
        System.out.println();
        demoInheritance(circle);
        System.out.println("------------------------------------------------------");

        //Generics Demonstration
        demoGenerics();
        System.out.println("------------------------------------------------------");

        demoObjectComparison();
        System.out.println("------------------------------------------------------");

        demoConcurrency();

    }
}
