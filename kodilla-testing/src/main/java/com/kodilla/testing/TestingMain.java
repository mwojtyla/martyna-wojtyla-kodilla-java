package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        // test 6.1 - Zadanie
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        // test 6.2 - Przykład
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // test 6.2 - Zadanie: pierwszy test jednostkowy
        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(51,88);
        int resultSub = calculator.substract(9,33);
        if (resultAdd == 139 && resultSub == 24){
            System.out.println("Test of Calculator: OK");
        } else{
        System.out.println("Test of Calculator: Error!");
        }

    }
}


