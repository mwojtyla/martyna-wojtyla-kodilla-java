package com.kodilla;

import java.util.*;

public class SumRacing {
    public static void main(String[] args) {
        int sumaA = 1000;
        int sumaB = 0;
        int iteratorCounter = 0;
        Random randomGenerator = new Random();
        while (sumaA > sumaB) {
            iteratorCounter++;
            sumaA = sumaA + randomGenerator.nextInt(10);
            sumaB = sumaB + randomGenerator.nextInt(50);
            if (sumaA > sumaB) {
                System.out.println("Number of Iteration: " + iteratorCounter);
                System.out.println("SumaA = " + sumaA);
                System.out.println("SumaB = " + sumaB);
            }

        }
        System.out.println("The end of the Loop.");
    }
}