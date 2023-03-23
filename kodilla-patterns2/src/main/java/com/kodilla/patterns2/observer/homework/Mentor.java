package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String name;

    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(TasksQueue taskQueue) {
        System.out.println(name + ": New task in queue: " + taskQueue.getName() + "\n" +
                " (total: " + taskQueue.getTasks().size() + " tasks)");
        updateCount++;
    }
}
