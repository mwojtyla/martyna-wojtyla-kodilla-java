package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Producer producer = new HealthyShop();
        String product = "Cornflakes";
        int amount = 2;

        return new OrderRequest(producer, product, amount);
    }


}
