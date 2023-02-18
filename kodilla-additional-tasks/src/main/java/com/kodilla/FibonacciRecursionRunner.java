package com.kodilla;

public class FibonacciRecursionRunner {
    public static void main (String[] args) {
        FibonacciRecursion fibonacci = new FibonacciRecursion();
        int result = fibonacci.recursion(1);
        System.out.println(result);
    }
}
