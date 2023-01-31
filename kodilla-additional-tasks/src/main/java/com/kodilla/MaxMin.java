package com.kodilla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMin {

    // Solution 1: with board
    int[] numbersList;

    public void setNumbersList(int[] numbersList) {
        this.numbersList = numbersList;
    }

    public void findMaxMin(int[] numbersList) {
        int min;
        int max;

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
            System.out.println("Max = " + max + " Min = " + min);
        }
    }

    /*// Solution 2: with ArrayList
    List<Integer> numbersList = new ArrayList<>();

    public MaxMin(final Integer... numbersList) {
        this.numbersList.addAll(Arrays.asList(numbersList));
    }

    public List<Integer> getNumbersList() {
        return numbersList;
    }

    public void findMaxMin(List<Integer> numbersList) {
        int min;
        int max;

        if (numbersList.size() == 0 || numbersList == null) {
            System.out.println("The list of numbers is empty or doesn't exist.");
        } else if (numbersList.size() == 1) {
            min = numbersList.get(0);
            max = numbersList.get(0);
            System.out.println("Max = " + max + " Min = " + min);
        } else if (numbersList.size() == 2) {
            if (numbersList.get(0) < numbersList.get(1)) {
                min = numbersList.get(0);
                max = numbersList.get(1);
                System.out.println("Max = " + max + " Min = " + min);
            } else {
                max = numbersList.get(0);
                min = numbersList.get(1);
                System.out.println("Max = " + max + " Min = " + min);
            }
        } else if (numbersList.size() > 2) {
            min = numbersList.get(0);
            max = numbersList.get(1);
            for (int i = 0; i < numbersList.size(); i++)
                if (numbersList.get(i) < min) {
                    min = numbersList.get(i);
                } else if (numbersList.get(i) > max) {
                    max = numbersList.get(i);
                }
            System.out.println("Max = " + max + " Min = " + min);
        }

    }*/
}


