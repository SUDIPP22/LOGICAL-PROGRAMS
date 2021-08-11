package com.bridgelabz;

import java.util.Scanner;

/**
 *Purpose : Whether the given input number from user is
 * a prime number or not
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-11
 */
public class PrimeNumber {
    /**
     * This is the main method which gives the output whether
     * the given input number is prime number or not
     * @param args Unused
     */
    public static void main(String[] args) {
        int y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = sc.nextInt();
        int x = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for (int i = 2; i <= x; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number");
                    y = 1;
                    break;
                }
            }
            if (y == 0) {
                System.out.println(n + " is a prime number");
                sc.close();
            }
        }
    }
}
