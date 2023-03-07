package com.kodilla;

public class BubbleSort {
    int[] numbers;

    public int[] bubbleSortAlgorithm(int[] numbers) {
        boolean nextSort = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            if (currentNumber > numbers[i+1]) {
                numbers[i] = numbers[i+1];
                numbers[i + 1] = currentNumber;
                nextSort = true;
            }
        }
        if (nextSort) {
            bubbleSortAlgorithm(numbers);
        }
        return numbers;
    }
}
