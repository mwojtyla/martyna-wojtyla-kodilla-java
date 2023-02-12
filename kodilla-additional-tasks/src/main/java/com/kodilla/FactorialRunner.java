package com.kodilla;

public class FactorialRunner {
    public static void main(String[] args){
        Factorial factorial = new Factorial();
        int result = factorial.factorial(5);

        System.out.println(result);
    }
}
