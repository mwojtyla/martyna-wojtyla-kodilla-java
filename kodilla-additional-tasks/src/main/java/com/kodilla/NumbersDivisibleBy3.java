package com.kodilla;

public class NumbersDivisibleBy3 {
    public static void main(String[] args) {

        System.out.println("Numbers divisible by 3 from the range (0-100): ");

        for (int i = 0; i <= 100; i++){
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
