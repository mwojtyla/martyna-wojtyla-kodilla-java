package com.kodilla.good.patterns.food2door;

public class OrderConfirmation {
    public void orderConfirmation(boolean resultOfOrder) {
        if (resultOfOrder) {
            System.out.println("Your order has been sent for processing.");
        } else {
            System.out.println("Sorry, due to the lack of a product, your order has not been processed.");
        }
    }

}
