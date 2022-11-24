package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge challenge2 = new SecondChallenge();

        try {
            String result = challenge2.probablyIWillThrowException(2.5, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Cannot show the result, because: x >= 2 || x < 1 || y == 1.5");
        }
        finally {
            System.out.println("End of the code");
        }
    }
}
