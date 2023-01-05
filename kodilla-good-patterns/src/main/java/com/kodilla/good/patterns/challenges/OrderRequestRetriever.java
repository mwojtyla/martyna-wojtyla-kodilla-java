package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Tom", "Smith");
        String product = "Lamp XYZ";
        double price = 87.99;

        return new OrderRequest(user, product, price);
    }
}
