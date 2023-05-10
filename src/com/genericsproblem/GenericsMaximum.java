package com.genericsproblem;

/*
 * Extend the max method to take more than three parameters
 */

import java.util.Arrays;

public class GenericsMaximum {
    /**
     * This method is for testMax using generics, and it's extends comparable
     * @param a
     * @param b
     * @param c
     * @param <T>
     */
    public static <T extends Comparable<T>> void testMax(T a, T b, T c) {
        T maximum = a;
        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        System.out.println("Maximum is " + maximum);

    }

    /**
     * This method is for getMaxMoreThanThreeParameter
     * @param x
     * @param arg
     * @return
     * @param <E>
     */

    @SafeVarargs
    public static <E> E getMaxMoreThanThree(E x, E... arg) {
        Arrays.sort(arg);
        return arg[arg.length - 1];
    }

    /*
     * Main method to call the testMax method and getMaxMoreThanThree parameter
     * @param args
     */

    public static void main(String[] args) {
        testMax(10, 20, 30);
        testMax(12.3f, 23.4f, 34.5f);
        testMax("rahul", "kundan", "sahil");
        System.out.println("maximum is " + getMaxMoreThanThree(4, 5, 6, 76, 12, 45, 31));
    }
}
