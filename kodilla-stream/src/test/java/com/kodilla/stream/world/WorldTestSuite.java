package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("37780000")));
        europe.addCountry(new Country("Spain", new BigDecimal("47330000" )));
        europe.addCountry(new Country("Germany", new BigDecimal("83130000")));

        Continent northAmerica = new Continent();
        northAmerica.addCountry(new Country("USA", new BigDecimal("332403650")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("37943231")) );
        northAmerica.addCountry(new Country("Mexico", new BigDecimal("128600000")) );

        Continent asia = new Continent();
        asia.addCountry(new Country("India", new BigDecimal("1339330514")));
        asia.addCountry(new Country("Japan", new BigDecimal("125396901")));
        asia.addCountry(new Country("China", new BigDecimal("1411778724")));

        World continents = new World();
        continents.addContinents(europe);
        continents.addContinents(northAmerica);
        continents.addContinents(asia);

        //When
        BigDecimal totalQuantity = BigDecimal.ZERO;
        for (Continent continent : continents.getWorld())
            for (Country countries : continent.getCountries())
            totalQuantity = totalQuantity.add(countries.getPeopleQuantity());

        //Then
        BigDecimal expectedTotalQuantity = new BigDecimal("3543693020");
        assertEquals(expectedTotalQuantity, totalQuantity);

    }
}
