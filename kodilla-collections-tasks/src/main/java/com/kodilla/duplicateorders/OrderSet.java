package com.kodilla.duplicateorders;

import java.util.HashSet;
import java.util.Set;

public class OrderSet {
    public static void main (String[] args) {

// Create list of orders with one duplicate order
        Set<Order> orderSet = new HashSet<>();
        orderSet.add(new Order(1));
        orderSet.add(new Order(2));
        orderSet.add(new Order(3));
        orderSet.add(new Order(4));
        orderSet.add(new Order(5));
        orderSet.add(new Order(6));
        orderSet.add(new Order(7));

// Add orders with existing id to the list of orders
        orderSet.add(new Order(5));
        orderSet.add(new Order(7));


// Display all orders and check whether the solution allows to store duplicate values
        for (Order newOrder: orderSet) {
            System.out.println(newOrder.getNumber());
        }

    }
}
