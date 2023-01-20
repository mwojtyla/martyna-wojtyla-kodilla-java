package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultInvestingStrategies() {
        //Given
        User teddy = new Millenials("Teddy Clarkson");
        User tom = new YGeneration("Tom Smith");
        User joe = new ZGeneration("Joe Letter");

        //When
        String teddySharePost = teddy.sharePost();
        System.out.println("Teddy share posts on: " + teddySharePost);
        String tomSharePost = tom.sharePost();
        System.out.println("Tom share posts on : " + tomSharePost);
        String joeSharePost = joe.sharePost();
        System.out.println("Joe share posts on : " + joeSharePost);


        //Then
        assertEquals("Snapchat", teddySharePost);
        assertEquals("Facebook", tomSharePost);
        assertEquals("Twitter", joeSharePost);
    }

    @Test
    void testIndividualInvestingStrategy() {
        //Given
        User teddy = new Millenials("Teddy Clarkson");

        //When
        String teddySharePost = teddy.sharePost();
        System.out.println("Teddy shared posts on: " + teddySharePost);
        teddy.setSocialPublisher(new FacebookPublisher());
        teddySharePost = teddy.sharePost();
        System.out.println("Now, Teddy share posts on: " + teddySharePost);

        //Then
        assertEquals("Facebook", teddySharePost);
    }
}
