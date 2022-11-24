package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {
    @Test
    public void testProbablyIWillThrowException(){
        // Given
        SecondChallenge challenge = new SecondChallenge();
        // When & Then
        assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1.5,2));
        assertAll(
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(2,0)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(3,1.5)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(0,1.5))
        );

    }
}
