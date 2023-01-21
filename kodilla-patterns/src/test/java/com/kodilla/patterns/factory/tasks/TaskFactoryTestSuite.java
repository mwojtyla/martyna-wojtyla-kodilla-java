package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {
    @Test
    void testTaskFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        assertEquals("Shopping task", shoppingTask.getTaskName());
        assertEquals("The shopping task is in progress.", shoppingTask.executeTask());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    void testTaskFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        assertEquals("Painting task", paintingTask.getTaskName());
        assertEquals("The painting task is in progress.", paintingTask.executeTask());
        assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    void testTaskFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        assertEquals("Driving task", drivingTask.getTaskName());
        assertEquals("The driving task is in progress.", drivingTask.executeTask());
        assertEquals(true, drivingTask.isTaskExecuted());
    }
}
