package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {
    public boolean order(final User user, final String product, final double price) {
        System.out.println("Order for: " + user.getName() + " " + user.getSurname()
                + " Product: " + product + " Price " + price + "zł");
        return true;
    }
}
