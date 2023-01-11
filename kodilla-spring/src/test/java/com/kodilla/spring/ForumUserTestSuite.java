package com.kodilla.spring;

import com.kodilla.spring.forum.ForumUser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class ForumUserTestSuite {

    @Test
    void testGetUsername() {
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = context.getBean(ForumUser.class);

        // When
        String userName = forumUser.getUsername();

        // Then
        assertEquals("John Smith", userName);
    }

}
