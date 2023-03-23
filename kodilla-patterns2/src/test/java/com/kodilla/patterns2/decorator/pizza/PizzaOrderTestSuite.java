package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost(){
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription(){
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testPizzaWithChampignonsAndHamOrderGetCost(){
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChampignonsDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(20.50), calculatedCost);
    }

    @Test
    public void testPizzaWithChampignonsAndHamGetDescription(){
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChampignonsDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza with tomato sauce and cheese + champignons + ham", description);
    }

    @Test
    public void testPizzaWithChampignonsAndPepperoniAndAdditionalCheeseOrderGetCost(){
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChampignonsDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(22.50), calculatedCost);
    }

    @Test
    public void testPizzaWithChampignonsAndPepperoniAndAdditionalCheeseGetDescription(){
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChampignonsDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza with tomato sauce and cheese + champignons + pepperoni + additional cheese", description);
    }
}
