package com.kodilla;

public class SortingRunner {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int numbers[] = new int[6];
        numbers[0] = 3;
        numbers[1] = 1;
        numbers[2] = 1;
        numbers[3] = 5;
        numbers[4] = 6;
        numbers[5] = -4;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        sorting.sortingAscendingNaturalNumbers(numbers);

    }
}

