package com.kodilla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersDivisibleByX {

    List<Integer> totalNumbersList = new ArrayList<>();
    List<Integer> numbersDivisibleList = new ArrayList<>();

    public List<Integer> dividedByX(int a, int b, int divider) {
        for (int i = a; i <= b; i++) {
            totalNumbersList.add(i);
        }
        for (int i = 0; i < totalNumbersList.size(); i++) {
            int tempNumb = totalNumbersList.get(i);
            if (tempNumb % divider == 0) {
                numbersDivisibleList.add(tempNumb);
            }
        }
        return numbersDivisibleList;
    }
}
