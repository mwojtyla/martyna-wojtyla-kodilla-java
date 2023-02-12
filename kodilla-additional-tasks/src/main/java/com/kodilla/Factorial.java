package com.kodilla;

public class Factorial {
    public int factorial(int number){
        int result = 1;
        for (int i=1; i<number; i++){
            result = result * (i+1);
        }
        return result;
    }
}
