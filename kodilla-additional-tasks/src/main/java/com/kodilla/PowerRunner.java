package com.kodilla;

public class PowerRunner {
    public static void main(String[] args) {
        Power power = new Power();
        int result1 = power.power(0, 6);
        int result2 = power.power(77, 0);
        int result3 = power.power(101, 1);
        int result4 = power.power(2, 8);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
