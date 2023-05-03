package com.genericsproblem;

/*
 * generics class which extend comparable
 * @param <generics>
 */

public class GenericsMaximum<generics extends Comparable<generics>> {
    generics s, t, r;

    /*
     * constructor of generics maximum
     * @param s
     * @param t
     * @param r
     */
    public GenericsMaximum(generics s, generics t, generics r) {
        this.s = s;
        this.t = t;
        this.r = r;
    }

    /*
     * generics method for test maximum which extend comparable
     * @param a
     * @param b
     * @param c
     * @param <E>
     */
    public static <E extends Comparable<E>> void testMax(E a, E b, E c) {
        E maximum = a;
        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        System.out.println("Maximum is " + maximum);

    }

    /*
     * main method for calling the test maximum method and checking for integer, float and string
     * @param args
     */
    public static void main(String[] args) {
        testMax(10, 20, 30);
        testMax(12.3f, 23.4f, 34.5f);
        testMax("rahul", "kumar", "sahi");
    }
}
