package com.genericsproblem;

import java.util.Arrays;
/*
 * Print method class to print max method
 */

public class GenericsMaximum {
    /**
     * Generics method to test max method to test maximum
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
     * Generics method print maximum method
     */

    @SafeVarargs
    public static <E> void printMax(E x, E... arg) {
        Arrays.sort(arg);
        System.out.println("Maximum is " + arg[arg.length - 1]);
    }

    /**
     * This is main method for calling all the method and passing the input and printing
     */
    public static void main(String[] args) {
        testMax(10, 20, 30);
        testMax(12.3f, 23.4f, 34.5f);
        testMax("rahul", "kumar", "twinkle");
        printMax(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
