package com.genericsproblem;

import java.util.Scanner;

public class GenericsMaximum {
    /*
     * Method for test maximum integer
     * @param a
     * @param b
     * @param c
     */

    public void getMax(Integer a, Integer b, Integer c) {
        Integer maximum = a;
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
        Integer a = sc.nextInt();
        System.out.println("Enter second value");
        Integer b = sc.nextInt();
        System.out.println("Enter third value");
        Integer c = sc.nextInt();
        genericsMax.getMax(a, b, c);
    }
}
