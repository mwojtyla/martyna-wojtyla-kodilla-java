package com.kodilla;

public class FibonacciSequencesRunner {

    public static void main (String[] args) {
        FibonacciSequences fibonacciSequences = new FibonacciSequences();
        int result = fibonacciSequences.sequences(8);

        System.out.println(result);
    }
}
