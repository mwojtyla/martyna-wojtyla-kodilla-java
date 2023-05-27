package com.kodilla;

public class MorseCode {
    public String decodingFromMorseCode(String wordInMorseCode) {
        String decodedWord = "";
        String temporary = "";
        wordInMorseCode += " ";

        for (int i = 0; i < wordInMorseCode.length()-1; i++) {
            temporary += wordInMorseCode.charAt(i);
            if (wordInMorseCode.charAt(i + 1) == ' ') {
                switch (temporary) {
                    case ".-":
                        decodedWord += "A";
                        break;
                    case "-...":
                        decodedWord += "B";
                        break;
                    case "-.-.":
                        decodedWord += "C";
                        break;
                    case "-..":
                        decodedWord += "D";
                        break;
                    case ".":
                        decodedWord += "E";
                        break;
                    case "..-.":
                        decodedWord += "F";
                        break;
                    case "--.":
                        decodedWord += "G";
                        break;
                    case "....":
                        decodedWord += "H";
                        break;
                    case "..":
                        decodedWord += "I";
                        break;
                    case ".---":
                        decodedWord += "J";
                        break;
                    case "-.-":
                        decodedWord += "K";
                        break;
                    case ".-..":
                        decodedWord += "L";
                        break;
                    case "--":
                        decodedWord += "M";
                        break;
                    case "-.":
                        decodedWord += "N";
                        break;
                    case "---":
                        decodedWord += "O";
                        break;
                    case ".--.":
                        decodedWord += "P";
                        break;
                    case "--.-":
                        decodedWord += "Q";
                        break;
                    case ".-.":
                        decodedWord += "R";
                        break;
                    case "...":
                        decodedWord += "S";
                        break;
                    case "-":
                        decodedWord += "T";
                        break;
                    case "..-":
                        decodedWord += "U";
                        break;
                    case "...-":
                        decodedWord += "V";
                        break;
                    case ".--":
                        decodedWord += "W";
                        break;
                    case "-..-":
                        decodedWord += "X";
                        break;
                    case "-.--":
                        decodedWord += "Y";
                        break;
                    case "--..":
                        decodedWord += "Z";
                        break;
                } temporary = "";
                i++;
            }
        }
        return decodedWord;
    }

}
