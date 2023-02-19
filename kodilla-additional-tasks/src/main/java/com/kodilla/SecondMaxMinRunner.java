package com.kodilla;

public class SecondMaxMinRunner {
    public static void main(String[] args) {
        SecondMaxMin secondMaxMin = new SecondMaxMin();
        int numbers[] = new int[12];
        numbers[0] = 3;
        numbers[1] = 1;
        numbers[2] = 1;
        numbers[3] = 5;
        numbers[4] = 6;
        numbers[5] = 7;
        numbers[6] = 9;
        numbers[7] = 15;
        numbers[8] = 3;
        numbers[9] = 4;
        numbers[10] = 7;
        numbers[11] = 10;

        /*for (int i=0; i< numbers.length; i++){
        System.out.print(numbers[i] + " ");
        */

        secondMaxMin.findSecondMaxMin(numbers);

    }
}
