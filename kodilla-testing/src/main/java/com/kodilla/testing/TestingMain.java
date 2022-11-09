package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        // test 6.1 - Zadanie
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        // test 6.2 - przykład
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
        System.out.println("Test of add method: " + resultAdd);
        System.out.println("Test of substract method: " + resultSub);
        }
}


