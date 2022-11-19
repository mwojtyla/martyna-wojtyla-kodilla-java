package com.kodilla.stream.world;

import java.math.BigDecimal;
/*Klasa Country ma udostępniać metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal.

 */
public final class Country {
    private final String countryName;
    private final BigDecimal quantity;

    public BigDecimal getPeopleQuantity() {
        return quantity;
    }
    public Country(final String countryName, final BigDecimal quantity) {
        this.countryName = countryName;
        this.quantity = quantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }
}

