package com.kodilla;

public class PrimeNumbersRunner {
    public static void main(String[] args){
        PrimeNumbers number = new PrimeNumbers();
        int n = 7;
        boolean result = number.checkPrime(n);

        System.out.println("Is the number \"" + n + "\" the prime number? " + result);
    }
}
