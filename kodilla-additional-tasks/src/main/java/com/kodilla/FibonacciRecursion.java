package com.kodilla;

public class FibonacciRecursion {
    public int recursion(int n) {

        if (n < 3) {
            return 1;
        } else {
            return recursion(n - 2) + recursion(n - 1);
        }
    }
}