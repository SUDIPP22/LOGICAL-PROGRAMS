package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose : Determining the given input from user is perfect number or not
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-11
 */
public class PerfectNumber {
    /**
     * This is the main method which gives the output whether
     * the given input number is perfect number or not
     * @param args Unused
     */
    public static void main(String[] args) {
        long sum = 0;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        long n = sc.nextLong();
        while (i <= n / 2) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println(n + " is a Perfect Number ");
        } else
            System.out.println(n + " is not a Perfect Number ");
        sc.close();
    }
}
