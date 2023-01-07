package com.kodilla.good.patterns.flights;

public class FlightFrom implements FlightSearch {
    public void flightFind(FlightRequest flightRequest) {

        System.out.println("Flights from: " + flightRequest.getFlight().getDepartureAirport());
        FlightDatabase.flights().stream()
                .filter(fly -> fly.getDepartureAirport().equals(flightRequest.getFlight().getDepartureAirport()))
                .forEach(s -> System.out.println(s));

    }
}
