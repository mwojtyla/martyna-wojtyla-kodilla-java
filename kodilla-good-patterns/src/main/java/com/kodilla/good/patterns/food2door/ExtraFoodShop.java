package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Producer {
    private String name = "ExtraFoodShop";

    public ExtraFoodShop() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendSMS() {
    }

    public void process(OrderRequest orderRequest) {
        boolean isOrdered = orderRequest.order(orderRequest.getProducer(), orderRequest.getProduct(), orderRequest.getAmount());

        if (isOrdered) {
            System.out.println("Your order has been accepted. Thank you for choosing Producer: " + name);
            sendSMS();
        }
    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }
}
