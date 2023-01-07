package com.kodilla.good.patterns.flights;

public class FlightRequestRetriever {
    public FlightRequest retrieve() {
        Flight flight = new Flight("", "London");
        String layover = "";

        return new FlightRequest(flight, layover);
    }
}
