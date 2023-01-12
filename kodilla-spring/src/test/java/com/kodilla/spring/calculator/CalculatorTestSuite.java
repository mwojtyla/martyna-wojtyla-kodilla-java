package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        // Given
        //When
        calculator.add(5.3, 4.2);
        calculator.sub(9.9, 12.4);
        calculator.mul(2.2, 3.3);
        calculator.div(5, 4);
        //Then
        // do nothing
    }
}
