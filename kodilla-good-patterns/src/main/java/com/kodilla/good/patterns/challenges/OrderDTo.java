package com.kodilla.good.patterns.challenges;

public class OrderDTo {
    private User user;
    private boolean isOrdered;

    public OrderDTo(final User user, final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }
    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
