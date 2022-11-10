package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.*;

public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test: end");
    }
    @DisplayName("When use exterminate method on the empty list, then return the empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        // Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        OddNumbersExterminator list = new OddNumbersExterminator();
        ArrayList<Integer> temporaryList = list.exterminate(emptyList);
        //Then
        for (Integer element: temporaryList){
            System.out.println(element);
        }
    }

    @DisplayName("When use exterminate method on the list with odd and even numbers, then exterminate method return list only with even numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(9);
        listOfNumbers.add(3);
        listOfNumbers.add(2);
        listOfNumbers.add(10);
        listOfNumbers.add(7);
        listOfNumbers.add(1);

        ArrayList<Integer> listOfExpectedNumbers = new ArrayList<>();
        listOfExpectedNumbers.add(2);
        listOfExpectedNumbers.add(10);

        //When
        OddNumbersExterminator evenlist = new OddNumbersExterminator();
        ArrayList<Integer> newlist = evenlist.exterminate(listOfNumbers);

        //Then
        Assertions.assertEquals(listOfExpectedNumbers, newlist);

    }
}
