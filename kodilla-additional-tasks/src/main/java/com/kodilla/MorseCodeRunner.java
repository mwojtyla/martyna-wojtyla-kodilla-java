package com.kodilla;

public class MorseCodeRunner {
    public static void main(String[] args) {
        MorseCode morseCode = new MorseCode();
        String decodedWord1 = morseCode.decodingFromMorseCode(".--- .- ...- .-");
        String decodedWord2 = morseCode.decodingFromMorseCode( "-.- --- -.. .. .-.. .-.. .- ");
        String decodedWord3 = morseCode.decodingFromMorseCode("-- .- .-. - -.-- -. .-");
        System.out.println(decodedWord1);
        System.out.println(decodedWord2);
        System.out.println(decodedWord3);
    }
}
