package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        FirstChallenge challenge = new FirstChallenge();
        if (b == 0) {
            throw new ArithmeticException();

        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("You can't divided by 0!");
        } finally {
            System.out.println("End of the code");
        }

    }
}
