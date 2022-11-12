package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Test add and remove figures")
    public class AddAndRemoveFigures {
        @Test
        void testAddFigure() {
            //Given
            Square square1 = new Square();
            ShapeCollector shapes = new ShapeCollector();

            //When
            shapes.addFigure(square1);

            //Then
            Assertions.assertEquals(1, shapes.getSize());

        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shape = new ShapeCollector();
            Square square1 = new Square();
            //When
            boolean result = shape.removeFigure(square1);
            //Then
            Assertions.assertFalse(result);
        }

    }

    @Nested
    @DisplayName("Test get and show figures")
    public class GetAndShowFigures {
        @Test
        void testGetFigure() {
            //Given
            Square square1 = new Square();
            ShapeCollector shape = new ShapeCollector();
            shape.addFigure(square1);
            //When
            Shape retrievedShape;
            retrievedShape = shape.getFigure(0);
            //Then
            Assertions.assertEquals(square1, retrievedShape);
        }

        @Test
        void testShowFigures() {
            //Given
            Square square1 = new Square();
            Circle circle1 = new Circle();
            Triangle triangle1 = new Triangle();

            ShapeCollector shape = new ShapeCollector();
            shape.addFigure(square1);
            shape.addFigure(circle1);
            shape.addFigure(triangle1);

            String text = "Square, Circle, Triangle";
            //When
            String retrievedShapes;
            retrievedShapes = shape.showFigures();

            //Then
            Assertions.assertEquals(text, retrievedShapes);
        }
    }

}
