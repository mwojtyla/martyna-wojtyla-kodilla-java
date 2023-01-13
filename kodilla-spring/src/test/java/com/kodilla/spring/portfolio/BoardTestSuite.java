package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasks().add("Call to friend");
        board.getInProgressList().getTasks().add("Cleaning the room");
        board.getDoneList().getTasks().add("Send an email");

        //When
        String result1 = board.getToDoList().getTasks().get(0);
        String result2 = board.getInProgressList().getTasks().get(0);
        String result3 = board.getDoneList().getTasks().get(0);

        //Then
        Assertions.assertEquals("Call to friend", result1);
        System.out.println("List of tasks to do: " + result1);

        Assertions.assertEquals("Cleaning the room", result2);
        System.out.println("List of tasks in progress: " + result2);

        Assertions.assertEquals("Send an email", result3);
        System.out.println("List of done tasks: " + result3);
    }
}
