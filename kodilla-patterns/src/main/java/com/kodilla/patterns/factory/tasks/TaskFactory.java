package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String DRIVING_TASK = "DRIVING TASK";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING_TASK -> new ShoppingTask("Shopping task", "Jacket", 1);
            case PAINTING_TASK -> new PaintingTask("Painting task", "blue", "wall");
            case DRIVING_TASK -> new DrivingTask("Driving task", "Spain", "bicycle");
            default -> null;
        };
    }
}