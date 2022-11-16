package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsCalculationsTestSuite {

   @Mock
   private Statistics statisticsMock;

   private static int testCounter = 0;

   @BeforeEach
   public void BeforeEveryTest(){
       testCounter++;
       System.out.println("Test nr: " + testCounter);

       List<String> username = new ArrayList<>();
       String user1 = new String("Jan Kowalski");
       String user2 = new String("Tomasz Nowak");
       String user3 = new String("Anna Nowakowska");
       String user4 = new String("Jolanta Kowal");
       username.add(user1);
       username.add(user2);
       username.add(user3);
       username.add(user4);

       when(statisticsMock.postsCount()).thenReturn(20);
       when(statisticsMock.commentsCount()).thenReturn(30);
       when(statisticsMock.username()).thenReturn(username);
   }


    @DisplayName("Test for 0 posts")
    @Test
    void testStatisticsCalculations0posts() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(0);
        StatisticsCalculations statisticResults = new StatisticsCalculations();
        // When
        statisticResults.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(4, statisticResults.getTotalAmountOfUsers());
        assertEquals(0, statisticResults.getTotalAmountOfPostsOnForum());
        assertEquals(30, statisticResults.getTotalAmountOfCommentsOnForum());
        assertEquals(0, statisticResults.getPostsAverageByUser());
        assertEquals(7.5, statisticResults.getCommentsAverageByUser());
        assertEquals(0, statisticResults.getCommentsAverageByPost());
        String results = statisticResults.showStatistics();
        System.out.println(results);
    }

    @DisplayName("Test for 1000 posts")
    @Test
    void testStatisticsCalculations1000posts() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatisticsCalculations statisticResults = new StatisticsCalculations();

        // When
        statisticResults.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(4, statisticResults.getTotalAmountOfUsers());
        assertEquals(1000, statisticResults.getTotalAmountOfPostsOnForum());
        assertEquals(30, statisticResults.getTotalAmountOfCommentsOnForum());
        assertEquals(250, statisticResults.getPostsAverageByUser());
        assertEquals(7.5, statisticResults.getCommentsAverageByUser());
        assertEquals(0.03, statisticResults.getCommentsAverageByPost());
        String results = statisticResults.showStatistics();
        System.out.println(results);
    }

    @DisplayName("Test for condition: amount of comments < amount of posts")
    @Test
    void testStatisticsCalculationsMorePosts() {
        // Given
        when(statisticsMock.commentsCount()).thenReturn(5);
        StatisticsCalculations statisticResults = new StatisticsCalculations();

        // When
        statisticResults.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(4, statisticResults.getTotalAmountOfUsers());
        assertEquals(20, statisticResults.getTotalAmountOfPostsOnForum());
        assertEquals(5, statisticResults.getTotalAmountOfCommentsOnForum());
        assertEquals(5, statisticResults.getPostsAverageByUser());
        assertEquals(1.25, statisticResults.getCommentsAverageByUser());
        assertEquals(0.25, statisticResults.getCommentsAverageByPost());
        String results = statisticResults.showStatistics();
        System.out.println(results);
    }

    @DisplayName("Test for condition: amount of comments > amount of posts")
    @Test
    void testStatisticsCalculationsMoreComments() {
        // Given
        StatisticsCalculations statisticResults = new StatisticsCalculations();

        // When
        statisticResults.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(4, statisticResults.getTotalAmountOfUsers());
        assertEquals(20, statisticResults.getTotalAmountOfPostsOnForum());
        assertEquals(30, statisticResults.getTotalAmountOfCommentsOnForum());
        assertEquals(5, statisticResults.getPostsAverageByUser());
        assertEquals(7.5, statisticResults.getCommentsAverageByUser());
        assertEquals(1.5, statisticResults.getCommentsAverageByPost());
        String results = statisticResults.showStatistics();
        System.out.println(results);
    }


    @DisplayName("Test for 0 users")
    @Test
    void testStatisticsCalculations0users() {
        // Given
        List<String> username = new ArrayList<>();
        when(statisticsMock.username()).thenReturn(username);
        StatisticsCalculations statisticResults = new StatisticsCalculations();

        // When
        statisticResults.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, statisticResults.getTotalAmountOfUsers());
        assertEquals(20, statisticResults.getTotalAmountOfPostsOnForum());
        assertEquals(30, statisticResults.getTotalAmountOfCommentsOnForum());
        assertEquals(0, statisticResults.getPostsAverageByUser());
        assertEquals(0, statisticResults.getCommentsAverageByUser());
        assertEquals(1.5, statisticResults.getCommentsAverageByPost());
        String results = statisticResults.showStatistics();
        System.out.println(results);
    }


    @DisplayName("Test for 100 users")
    @Test
    void testStatisticsCalculations100users() {
        // Given
        List<String> username = new ArrayList<>();
        for (int n = 0; n<100; n++){
            String user = "User " + n;
            username.add(user);
        }
        when(statisticsMock.username()).thenReturn(username);
        StatisticsCalculations statisticResults = new StatisticsCalculations();

        // When
        statisticResults.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(100, statisticResults.getTotalAmountOfUsers());
        assertEquals(20, statisticResults.getTotalAmountOfPostsOnForum());
        assertEquals(30, statisticResults.getTotalAmountOfCommentsOnForum());
        assertEquals(0.2, statisticResults.getPostsAverageByUser());
        assertEquals(0.3, statisticResults.getCommentsAverageByUser());
        assertEquals(1.5, statisticResults.getCommentsAverageByPost());
        String results = statisticResults.showStatistics();
        System.out.println(results);

    }
 }
