package com.genericsproblem;

public class GenericsMaximum {
    /*
     * method for test maximum using generics which extends comparable
     * @param a
     * @param b
     * @param c
     * @param <generics>
     */
    public static <generics extends Comparable<generics>> void testMax(generics a, generics b, generics c) {
        generics maximum = a;
        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        System.out.println("Maximum is " + maximum);
    }

    /*
     * main method for call the testMax method for integer,float and strings
     * @param args
     */

    public static void main(String[] args) {
        testMax(10,20,30);
        testMax(12.3f,23.4f,34.5f);
        testMax("rahul","kundan","sahil");
    }
}
