package com.kodilla;

import java.util.ArrayList;

public class Sorting {
    ArrayList<Integer> list = new ArrayList<>();

    public void sortingAscendingNaturalNumbers(int[] numbersList) {
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



        for (int j = 0; j < numbersList.length; j++) {
            if (numbersList[j] >= 0) {
                list.add(numbersList[j]);
            }
        }

        int newList[] = new int[list.size()];
        for (int j = 0; j < newList.length; j++) {
            newList[j] = list.get(j);
            System.out.print(newList[j] + " ");
        }
    }

}
