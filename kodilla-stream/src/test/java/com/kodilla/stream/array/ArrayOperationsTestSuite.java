package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){

        //Given
        int[] numbers = new int[20];
        numbers[0] = 8;
        numbers[1] = 345;
        numbers[2] = 89;
        numbers[3] = 1000;
        numbers[4] = 901;
        numbers[5] = 269;
        numbers[6] = 56;
        numbers[7] = 1;
        numbers[8] = 999;
        numbers[9] = 2060;
        numbers[10] = 55;
        numbers[11] = 111;
        numbers[12] = 109;
        numbers[13] = 482;
        numbers[14] = 66;
        numbers[15] = 9;
        numbers[16] = 3589;
        numbers[17] = 0;
        numbers[18] = 31;
        numbers[19] = 777;

        //When
        double average = getAverage(numbers);

        //Then
        assertEquals(547.85, average );
    }
}
