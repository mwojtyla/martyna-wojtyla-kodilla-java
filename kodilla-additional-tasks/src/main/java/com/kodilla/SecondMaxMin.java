package com.kodilla;

public class SecondMaxMin {
    public void findSecondMaxMin(int[] numbersList) {
        int min;
        int max;
        int secondMin;
        int secondMax;

        for (int i = 0; i < numbersList.length; i++) {
            for (int n = i + 1; n < numbersList.length; n++) {
                int a = numbersList[i];
                int b = numbersList[n];
                if (a > b) {
                    numbersList[i] = b;
                    numbersList[n] = a;
                }
            }

        }
            /*for (int j=0; j< numbersList.length; j++) {
                System.out.print(numbersList[j] + " ");
            }*/

        if (numbersList.length == 0 || numbersList == null) {
            System.out.println("The list of numbers is empty or doesn't exist.");
        } else if (numbersList.length == 1) {
            min = numbersList[0];
            max = numbersList[0];
            System.out.println("Max = " + max + " Min = " + min);
        } else if (numbersList.length == 2) {
            if (numbersList[0] < numbersList[1]) {
                min = numbersList[0];
                max = numbersList[1];
                System.out.println("Max = " + max + " Min = " + min);
            } else {
                max = numbersList[0];
                min = numbersList[1];
                System.out.println("Max = " + max + " Min = " + min);
            }
        } else if (numbersList.length > 2) {
            min = numbersList[0];
            max = numbersList[1];
            for (int i = 0; i < numbersList.length; i++) {
                if (numbersList[i] < min) {
                    min = numbersList[i];
                } else if (numbersList[i] > max) {
                    max = numbersList[i];
                }
            }

            for (int m=0; m< numbersList.length-1; m++) {
                if (numbersList[m] != numbersList[m+1]) {
                    secondMin = numbersList[m+1];
                    System.out.println("Second Min = " + secondMin);
                    break;
                }
            }

            for (int m=numbersList.length; m>0 ; m--) {
                if (numbersList[m - 2] != numbersList[m - 1]) {
                    secondMax = numbersList[m - 2];
                    System.out.println("Second Max = " + secondMax);
                    break;
                }

            }

        }
    }
}
