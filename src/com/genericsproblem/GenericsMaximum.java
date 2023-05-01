package com.genericsproblem;

import java.util.Scanner;

public class GenericsMaximum {
    /*
     * Method for test maximum float
     * @param a
     * @param b
     * @param c
     */

    public void getMax(Float a, Float b, Float c) {
        Float maximum = a;
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
        Float a = sc.nextFloat();
        System.out.println("Enter second value");
        Float b = sc.nextFloat();
        System.out.println("Enter third value");
        Float c = sc.nextFloat();
        genericsMax.getMax(a, b, c);
    }
}
