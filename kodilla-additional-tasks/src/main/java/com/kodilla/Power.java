package com.kodilla;

public class Power {
    public int power(int base, int exponent){
        int result = 1;
        for (int i=0; i<exponent; i++){
            result = result * base;
        }
        return result;
    }
}
