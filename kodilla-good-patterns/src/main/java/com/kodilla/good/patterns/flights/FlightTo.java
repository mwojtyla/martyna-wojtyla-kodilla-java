package com.kodilla.good.patterns.flights;

public class FlightTo implements FlightSearch {
    public void flightFind(FlightRequest flightRequest) {

        System.out.println("Flights to: " + flightRequest.getFlight().getArrivalAirport());
        FlightDatabase.flights().stream()
                .filter(fly -> fly.getArrivalAirport() == flightRequest.getFlight().getArrivalAirport())
                .forEach(s -> System.out.println(s));
    }
}
