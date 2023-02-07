package com.kodilla;

public class Vowels {

    public String vowelsFind(String word){
        String vowelsFromWord = "";
        for (int i=0; i<word.length(); i++) {
            if (Character.toString(word.charAt(i)).equalsIgnoreCase("a") ||
                Character.toString(word.charAt(i)).equalsIgnoreCase("e") ||
                Character.toString(word.charAt(i)).equalsIgnoreCase("i") ||
                Character.toString(word.charAt(i)).equalsIgnoreCase("o") ||
                Character.toString(word.charAt(i)).equalsIgnoreCase("u") ||
                Character.toString(word.charAt(i)).equalsIgnoreCase("y")){
                vowelsFromWord = vowelsFromWord + word.charAt(i);
            }
        }
        return vowelsFromWord;
    }
}
