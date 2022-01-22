package com.demo.GreatestCommonDivisor;

import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * This Class extends Thread class and provides a lambda expression which calculates GCD of two numbers.
 * @author Shreyash Solunke
 * @version 1.0.0
 */
public class CalcThread extends Thread{

    private String threadName;
    private List<IntegerPair> data;
    private int start;
    private int end;

    /**
     *
     * @param threadName - Thread name acting as identifier
     * @param data - ArrayList of IntegerPair class which contains integer pair
     * @param start - Starting index which denotes the sublist of an array
     * @param end - Ending index of an array which denotes the sublist of array
     */
    public CalcThread(String threadName, List<IntegerPair> data, int start, int end) {
        this.threadName = threadName;
        this.data = data;
        this.start = start;
        this.end = end;
    }

    /**
     * This method is run by each individual thread to calculate GCD of given integer pairs.
     * Lambda expression is used which finds the GCD by using stream of integers
     */
    public void run() {
        List<IntegerPair> subList = data.subList(start, end);

        //lambda expression to calculate GCD
        //minimum number of two integers is divided by (1 ... min) till we find GCD
        //Integer stream
        Function<IntegerPair, Integer> fn = test -> IntStream
                .range(1, Math.min(test.numberOne, test.numberTwo) + 1)
                .filter(i -> test.numberOne % i == 0 && test.numberTwo % i == 0)
                .reduce((first, second) -> second)
                .stream().findFirst().orElse(Math.max(test.numberOne, test.numberTwo));
                //.getAsInt();  //if no need to handle 0

        subList.forEach(integerPair -> System.out.println("GCD(" + integerPair.numberOne + "," + integerPair.numberTwo + ") = " + integerPair.calculateGCD(fn)));
    }

}
