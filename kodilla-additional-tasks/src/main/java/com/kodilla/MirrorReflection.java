package com.kodilla;

public class MirrorReflection {
    public String mirrorReflection(String word){
        String temporaryWord = "";
        for (int i=word.length()-1; i>=0; i--) {
            temporaryWord = temporaryWord + word.charAt(i);
        }
        return temporaryWord;
    }
}
