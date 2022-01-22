package com.demo.Generics;

/** This abstract implements MinMaxInterface and demonstrates Strong type checking.
    * This class also adds an abstract method for finding mid-element.
    * @param <T> Any data type or Class type which extends Comparable class.
    * @author Shreyash Solunke
    * @version 1.0.0
 */
public class MinMaxMidFinder <T extends Comparable<T>> extends MinMaxImpl<T>{

    /**
     * Array which holds T objects.
     */
    T[] inpArray;

    /**
     *
     * @param inpArray - Array of Generic data type
     */
    public MinMaxMidFinder(T[] inpArray) {
        super(inpArray);
        this.inpArray = inpArray;
    }

    /**
     * This method returns the middle element of the array.
     * Returns length/2 if number of elements are odd.
     * Returns length/2 + 1 if number of elements are even.
     * @return T - Mid Element of the array
     */
    @Override
    public T getMidElement() {
        int size = inpArray.length;
        return inpArray[size/2];
    }
}
