package com.kodilla.snakeletters;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class EvenAndOdd {
    public void printEvenAndOdd(Deque<String> theQueue) {
        int temporaryValue = 0;
        List<String> evenArray = new ArrayList<>();
        List<String> oddArray = new ArrayList<>();
        Iterator<String> iteratorA = theQueue.iterator();

        while (iteratorA.hasNext()) {
            String currentelement = iteratorA.next();
            temporaryValue = currentelement.length();

            if(temporaryValue % 2==0) {
                evenArray.add(currentelement);
            } else {
                oddArray.add(currentelement);
            }

        }


        System.out.println("Collection size with even objects: " + evenArray.size() + "\n" + "The even Array:");
        for (String even: evenArray) {
            System.out.println(even);
        }
        System.out.println("\n");
        System.out.println("Collection size with odd objects: " + oddArray.size() + "\n" + "The odd Array:");
        for (String odd: oddArray) {
            System.out.println(odd);
        }
    }

}

