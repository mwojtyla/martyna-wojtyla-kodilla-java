package com.kodilla;

public class ChangeStringIntoNumber {

    public int change(String text) throws NumberFormatException {
        return Integer.parseInt(String.valueOf(text));
    }
}
