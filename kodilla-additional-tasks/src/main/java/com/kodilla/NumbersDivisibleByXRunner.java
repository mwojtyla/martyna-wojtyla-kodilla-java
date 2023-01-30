package com.kodilla;

import java.util.List;

public class NumbersDivisibleByXRunner {

    public static void main(String[] args) {
        NumbersDivisibleByX numbersDivisibleByX = new NumbersDivisibleByX();

        List<Integer> list = numbersDivisibleByX.dividedByX(9, 109, 12);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
