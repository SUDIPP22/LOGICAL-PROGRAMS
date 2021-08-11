package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose : To print a Fibonacci series
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-11
 */
public class FibonacciSeries {
    public static int num1 = 0;
    public static int num2 = 1;

    /**
     * This is the main method which makes use of showFibSeries method
     * @param args Unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showFibSeries(sc);

    }

    /**
     * This method will be showing us the Fibonacci series
     * @param sc This is the first parameter to showFibSeries method
     */
    public static void showFibSeries(Scanner sc) {
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        System.out.print("Fibonacci series are : " + num1 + " " + num2);
        /*
        * This loop iterates from 2 up to given input value
         */
        for (int i = 2; i < n; ++i) {
            int fib = num1 + num2;
            num1 = num2;
            num2 = fib;
            System.out.print(" " + fib);
            System.out.print("");
        }
        sc.close();
    }
}
