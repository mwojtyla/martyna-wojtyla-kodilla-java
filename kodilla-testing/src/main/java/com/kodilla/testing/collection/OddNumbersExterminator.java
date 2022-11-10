package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;


public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenList = new ArrayList<>();
        Iterator<Integer> iteratorNumber = numbers.iterator();

        while (iteratorNumber.hasNext()) {
            Integer currentElement = iteratorNumber.next();

            if (currentElement % 2 == 0) {
                evenList.add(currentElement);
            }
        }
        return evenList;

    }
}
