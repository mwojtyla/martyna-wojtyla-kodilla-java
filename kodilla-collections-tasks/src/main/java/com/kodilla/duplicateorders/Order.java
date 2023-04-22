package com.kodilla.duplicateorders;

public class Order {
    int number;

    public Order(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        Order a = (Order) o;
        return number == a.getNumber();
    }

    @Override
    public int hashCode() {
        return number;
    }

    public int getNumber(){
        return number;
    }
}
