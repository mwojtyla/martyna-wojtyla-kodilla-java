package com.kodilla.good.patterns.food2door;


public class HealthyShop implements Producer {
    private String name = "HealthyShop";

    public HealthyShop() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendEmail() {
    }

    public void process(OrderRequest orderRequest) {
        boolean isOrdered = orderRequest.order(orderRequest.getProducer(), orderRequest.getProduct(), orderRequest.getAmount());

        if (isOrdered) {
            System.out.println("Thank you for your order from Producer: " + name);
            sendEmail();
        }
    }

    @Override
    public String toString() {
        return "HealthyShop";
    }
}
