package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose : Given N distinct Coupon Numbers, how many random numbers do you
 * need to generate a distinct coupon number? This program simulates this random
 * process.
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-11
 */
public class CouponNumbers {
    /**
     * This is the main method which gives the output
     * of n distinct coupon number
     * @param args Unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coupon number");
        char n = sc.next().charAt(0);
        /*
        *isCollected[] = true if card  has been collected
        * @count indicates total number of cards collected
        * @distinct indicates number of distinct cards
         */
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int distinct = 0;
        /*
        * This loop repeatedly chose a random number and
        * check whether it is a new one
         */
        while (distinct < n) {
            int value = (int) (Math.random() * n);
            count++;
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;
            }
        }
        /* print the total number of cards collected */
        System.out.println("Coupon code is : " + count);
    }
}

