package com.genericsproblem;

import java.util.Scanner;

public class GenericsMaximum {
    /*
     * Method for test maximum float
     * @param a
     * @param b
     * @param c
     */

    public void getMax(String a, String b, String c) {
        String maximum = a;
        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        System.out.println("Maximum is : " + maximum);
    }

    /*
     * Main method for taking user input and calling the get max method
     * @param args
     */

    public static void main(String[] args) {
        GenericsMaximum genericsMax = new GenericsMaximum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        String a = sc.next();
        System.out.println("Enter second value");
        String b = sc.next();
        System.out.println("Enter third value");
        String c = sc.next();
        genericsMax.getMax(a, b, c);
    }
}
