package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        // Given
        TasksQueue joeTasksQueue = new TraineeJoeTasksQueue();
        TasksQueue lilyTasksQueue = new TraineeLilyTasksQueue();
        TasksQueue jamesTasksQueue = new TraineeJamesTasksQueue();
        TasksQueue roseTasksQueue = new TraineeRoseTasksQueue();
        Mentor luke = new Mentor("Luke Smith");
        Mentor william = new Mentor("William Connor");
        joeTasksQueue.registerObserver(luke);
        lilyTasksQueue.registerObserver(luke);
        jamesTasksQueue.registerObserver(william);
        roseTasksQueue.registerObserver(william);

        // When
        joeTasksQueue.addTask("Task 1.0");
        jamesTasksQueue.addTask("Task 3.3");
        jamesTasksQueue.addTask("Task 3.4");
        joeTasksQueue.addTask("Task 1.1");
        roseTasksQueue.addTask("Task 20.0");
        roseTasksQueue.addTask("Task 20.1");
        jamesTasksQueue.addTask("Task 4.0");
        lilyTasksQueue.addTask("Task 12.2");
        roseTasksQueue.addTask("Task 20.2");
        roseTasksQueue.addTask("Task 20.3");

        // Then
        assertEquals(3,luke.getUpdateCount());
        assertEquals(7,william.getUpdateCount());
    }
}
