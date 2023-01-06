package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Producer {
    private String name = "GlutenFreeShop";

    public GlutenFreeShop() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void callToClient() {
    }

    public void process(OrderRequest orderRequest) {
        boolean isOrdered = orderRequest.order(orderRequest.getProducer(), orderRequest.getProduct(), orderRequest.getAmount());

        if (isOrdered) {
            System.out.println("Order accepted. " + name);
            callToClient();
        }
    }

    @Override
    public String toString() {
        return "GlutenFreeShop";
    }
}
