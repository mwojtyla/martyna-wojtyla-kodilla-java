package com.kodilla;

public class ChangeSignIntoNumber {
    public int changed(char sign) throws IllegalArgumentException {
        if (sign < '0' || sign > '9') {
            throw new IllegalArgumentException();
        }
        return Character.getNumericValue(sign);

        // another solution :)
        // return Integer.parseInt(String.valueOf(sign));
    }
}

