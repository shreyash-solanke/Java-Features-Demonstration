package com.demo.Generics;

/**
 * This abstract implements MinMaxInterface and demonstrates Strong type checking.
 * This class also adds an abstract method for finding mid-element.
 * @param <T> Any data type or Class type which extends Comparable class.
 * @author Shreyash Solunke
 * @version 1.0.0
 */
public abstract class MinMaxImpl<T extends Comparable<T>> implements MinMaxInterface {

    /**
     * Array which holds T objects.
     */
    T[] inpArray;

    /**
     *
     * @param inpArray - Array of Generic data type
     */
    public MinMaxImpl(T[] inpArray) {
        this.inpArray = inpArray;
    }

    /**
     *
     * @return T - TThe maximum element of this array based on #Object.equals method
     */
    @Override
    public T maxValue() {
        T maxElement = inpArray[0];
        for(int i=1; i<inpArray.length; i++) {
            if(inpArray[i].compareTo(maxElement) > 0) {
                maxElement = inpArray[i];
            }
        }
        return maxElement;
    }

    /**
     *
     * @return T - The minimum element of this array based on #Object.equals method
     */
    @Override
    public T minValue() {
        T minElement = inpArray[0];
        for(int i=1; i<inpArray.length; i++) {
            if(inpArray[i].compareTo(minElement) < 0) {
                minElement = inpArray[i];
            }
        }
        return minElement;
    }

    public abstract T getMidElement();

}
