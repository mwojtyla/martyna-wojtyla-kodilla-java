package com.kodilla;

public class Wrappers{
    public static void main (String[] args) {
        float number = 10;
        char sign = 'M';
        boolean variable = true;

        Float numberOne = number;
        Character signOne = sign;
        Boolean variableOne = variable;

        if (number==numberOne){
            System.out.println("Value of number is equal to the value of numberOne.");
        } else {
            System.out.println("Value of number and value of numberOne are different.");
        }
        if (sign==signOne){
            System.out.println("Value of sign is equal to the value of signOne.");
        } else {
            System.out.println("Value of sign and value of signOne are different.");
        }
        if (variable==variableOne){
            System.out.println("Value of variable is equal to the value of variableOne.");
        } else {
            System.out.println("Value of variable and value of variableOne are different.");
        }
    }
}
