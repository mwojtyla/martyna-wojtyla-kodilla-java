package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinents (Continent continent){
        continents.add(continent);
    }

    public List<Continent> getWorld() {
        return continents;
    }

    public BigDecimal getPeopleQuantity() {
    BigDecimal totalQuantity = continents.stream()
            .flatMap(country -> country.getCountries().stream())
            .map(Country::getQuantity)
            .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    return totalQuantity;
    }
}
