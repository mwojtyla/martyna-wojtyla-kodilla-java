package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {

    public static List<Flight> flights() {
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Paris", "Berlin"));
        flights.add(new Flight("Madrid", "Berlin"));
        flights.add(new Flight("Poznan", "London"));
        flights.add(new Flight("Paris", "Lisbon"));
        flights.add(new Flight("Madrid", "Poznan"));
        flights.add(new Flight("London", "Madrid"));
        flights.add(new Flight("Berlin", "London"));

        return new ArrayList<>(flights);
    }
}
