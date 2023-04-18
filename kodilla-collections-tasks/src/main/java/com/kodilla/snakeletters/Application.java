package com.kodilla.snakeletters;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class Application {
    public static void main (String[] args)  throws java.lang.Exception  {

        Deque<String> queueLetterA = new ArrayDeque<>();
        Random theGenerator = new Random();

        ObjectA letters = new ObjectA();
        for (int i=0; i<50; i++){
            String letter = letters.generateA(theGenerator.nextInt(50));
            queueLetterA.offer(letter);
        }
        //System.out.println(queueLetterA);
        //System.out.println(queueLetterA.size());


        EvenAndOdd lists = new EvenAndOdd();
        lists.printEvenAndOdd(queueLetterA);



    }
}
