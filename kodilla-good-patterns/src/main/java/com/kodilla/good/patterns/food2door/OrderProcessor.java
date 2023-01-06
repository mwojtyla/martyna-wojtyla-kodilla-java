package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    GlutenFreeShop glutenFreeShop;
    ExtraFoodShop extraFoodShop;
    HealthyShop healthyShop;
    OrderConfirmation orderConfirmation = new OrderConfirmation();

    public OrderProcessor(GlutenFreeShop glutenFreeShop, ExtraFoodShop extraFoodShop, HealthyShop healthyShop) {
        this.glutenFreeShop = glutenFreeShop;
        this.extraFoodShop = extraFoodShop;
        this.healthyShop = healthyShop;
    }

    public boolean processForAllProducers(OrderRequest orderRequest) {
        if (orderRequest.getProducer().getClass().getName().equals(glutenFreeShop.getClass().getName())) {
            glutenFreeShop.process(orderRequest);
            return true;
        } else if (orderRequest.getProducer().getClass().getName().equals(extraFoodShop.getClass().getName())) {
            extraFoodShop.process(orderRequest);
            return true;
        } else if (orderRequest.getProducer().getClass().getName().equals(healthyShop.getClass().getName())) {
            healthyShop.process(orderRequest);
            return true;
        }
        return false;
    }
}

