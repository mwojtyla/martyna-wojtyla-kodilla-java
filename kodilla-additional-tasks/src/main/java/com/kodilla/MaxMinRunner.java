package com.kodilla;

import java.util.List;

public class MaxMinRunner {

    public static void main(String[] args) {

        // Solution 1: with board
        MaxMin maxmin = new MaxMin();
        int numbers[] = new int[11];
        numbers[0] = 3;
        numbers[1] = 1;
        numbers[2] = 5;
        numbers[3] = 6;
        numbers[4] = 7;
        numbers[5] = 9;
        numbers[6] = 15;
        numbers[7] = 3;
        numbers[8] = 4;
        numbers[9] = 7;
        numbers[10] = 10;


        maxmin.setNumbersList(numbers);
        maxmin.findMaxMin(numbers);
    }

    /*  // Solution 2: with ArrayList
        MaxMin maxmin = new MaxMin(3, 1, 5, 6, 7, 9, 15, 3, 4, 7, 10);
        List<Integer> list = maxmin.getNumbersList();
        maxmin.findMaxMin(list);
    }*/
}

