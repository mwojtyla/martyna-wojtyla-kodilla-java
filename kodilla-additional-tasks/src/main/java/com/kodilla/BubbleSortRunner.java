package com.kodilla;

import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {
        int[] numbersList = new int[8];
        numbersList[0] = 2;
        numbersList[1] = 1;
        numbersList[2] = 8;
        numbersList[3] = 5;
        numbersList[4] = 4;
        numbersList[5] = 2;
        numbersList[6] = 4;
        numbersList[7] = 1;

        BubbleSort bubbleSort = new BubbleSort();

        System.out.print(Arrays.toString(numbersList));
        System.out.println();
        System.out.print(Arrays.toString(bubbleSort.bubbleSortAlgorithm(numbersList)));
    }
}

