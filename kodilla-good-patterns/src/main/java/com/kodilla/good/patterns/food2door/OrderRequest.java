package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private Producer producer;
    private String product;
    private int amount;

    public OrderRequest(final Producer producer, final String product, final int amount) {
        this.producer = producer;
        this.product = product;
        this.amount = amount;
    }

    public boolean order(Producer producer, String product, int amount){
        System.out.println("Order details: Producer: " + producer + " Product: " + product
            + "  Amount: " + amount);
        return true;
    }
    public Producer getProducer() {
        return producer;
    }

    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }


}
