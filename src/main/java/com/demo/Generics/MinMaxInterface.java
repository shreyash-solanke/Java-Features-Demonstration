package com.demo.Generics;

/**
 *
 * @param <T> - Any data type or Class type which extends Comparable class.
 */
public interface MinMaxInterface<T extends Comparable<T>> {
    public T maxValue();
    public T minValue();
}
