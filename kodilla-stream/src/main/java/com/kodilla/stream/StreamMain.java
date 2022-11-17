package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {                                   // [4]
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();       // [5]

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);           // [6]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);           // [7]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);           // [8]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);           // [9]

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Beautify text with lambdas");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("letters", (text) -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Java", (text) -> text.toUpperCase());
        poemBeautifier.beautify("KODILLA", (text) -> text.toLowerCase());
        poemBeautifier.beautify("Happy text", (text) -> text.concat(" :-)"));
        poemBeautifier.beautify("flowers", (text) -> "\u001B[1m" + text );

    }
}