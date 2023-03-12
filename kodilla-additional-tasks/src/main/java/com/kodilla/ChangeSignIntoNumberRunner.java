package com.kodilla;

public class ChangeSignIntoNumberRunner {

    public static void main(String[] args) {
        ChangeSignIntoNumber changedSignIntoNumber = new ChangeSignIntoNumber();

        try {
            int receivedNumber = changedSignIntoNumber.changed('6');
            System.out.println(receivedNumber);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid type of value entered. Choose a digit");
        }
    }
}
