package com.kodilla;

public class ChangeStringIntoNumberRunner {
    public static void main(String[] args) {
        ChangeStringIntoNumber changeStringIntoNumber = new ChangeStringIntoNumber();
        try {
            int receivedNumber = changeStringIntoNumber.change("2023");
            System.out.println(receivedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid type of value entered. Choose numbers");
        }
    }
}
