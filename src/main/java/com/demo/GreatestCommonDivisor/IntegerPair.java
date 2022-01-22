package com.demo.GreatestCommonDivisor;

import java.util.function.Function;

/**
 * Class to hold two integers so their GCD can be calculated
 * @author shreyash
 * @version 1.0.0
 */
public class IntegerPair {

    public Integer numberOne;
    public Integer numberTwo;

    /**
     *
     * @param numberOne - First number (min:0 max: INTEGER.MAX)
     * @param numberTwo - Second number (min:0 max: INTEGER.MAX)
     */
    public IntegerPair(Integer numberOne, Integer numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    @Override
    public String toString() {
        return "IntegerPair{" +
                "numberOne=" + numberOne +
                ", numberTwo=" + numberTwo +
                '}';
    }

    /**
     * This is the method which uses lambda consumer to calculate GCD
     * @param fn - Functional interface for lambda.
     * @return - The function result
     */
    public Integer calculateGCD(Function<IntegerPair, Integer> fn) {
        return fn.apply(this);
    }
}
