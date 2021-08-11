package com.bridgelabz;

import java.util.Scanner;

import static java.lang.System.currentTimeMillis;

/**
 * Purpose : Measuring the elapsed time
 * between the start and end of a stopwatch
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-11
 */
public class StopWatch {
    /**
     * This is the main method which gives the output of
     * elapsed time
     * @param args Unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start the stopwatch from :");
        sc.nextDouble();
        double start;
        start = currentTimeMillis();                                        /* converting the input starting time in milliseconds */
        System.out.println("End the stopwatch to : ");
        sc.nextDouble();
        double stop;
        stop = currentTimeMillis();                                        /* converting the input ending time in milliseconds */
        /*
        * Calculating and converting the elapsed time in seconds,
        * then displaying the elapsed time.
         */
        double elapsedTime = (stop-start)/1000;
        System.out.println("Elapsed Time is " +elapsedTime+ " seconds");
        sc.close();
    }
}
