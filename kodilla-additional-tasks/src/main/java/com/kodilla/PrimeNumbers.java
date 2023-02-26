package com.kodilla;

public class PrimeNumbers {

    public boolean checkPrime(int n) {
        int counter = 0;
        boolean primeNumber;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 0 && n>1) {
            primeNumber = true;
        } else {
            primeNumber = false;
        }

        return primeNumber;
    }
}
