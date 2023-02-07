package com.kodilla;

public class VowelsRunner {
     public static void main(String[] args) {
        Vowels vowels = new Vowels();
        String word = vowels.vowelsFind("Adam");
        System.out.println(word);
    }
}
