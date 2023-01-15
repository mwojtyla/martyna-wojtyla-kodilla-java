package com.kodilla;

public class QuickSwap {
    public static void main(String[] args) {
        int a;
        int b;
        int temp;

        a = 5;
        b = 7;

        System.out.println("Before swap: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);

    }
}
