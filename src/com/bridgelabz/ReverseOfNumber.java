package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose : Determining the reverse given input number from user
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-11
 */
public class ReverseOfNumber {
    /**
     * This is the main method which gives the output
     * by reversing a number
     * @param args Unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0) {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }
        System.out.println("The Reverse of the number is : " + rev);
        sc.close();
    }
}
