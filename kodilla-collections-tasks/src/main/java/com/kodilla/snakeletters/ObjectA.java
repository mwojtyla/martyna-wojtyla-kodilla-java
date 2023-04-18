package com.kodilla.snakeletters;

public class ObjectA {
    public String generateA(int number){
        String lettersA = "";
        for (int i=0; i<number; i++) {
            lettersA = lettersA + "a";
        }
        return lettersA;
    }
}
