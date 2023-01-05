package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private User user;
    private String product;
    private double price;

    public OrderRequest(final User user, final String product, final double price) {
        this.user = user;
        this.product = product;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }
}
