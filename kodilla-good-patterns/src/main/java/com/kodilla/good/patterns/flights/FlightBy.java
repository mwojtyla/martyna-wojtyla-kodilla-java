package com.kodilla.good.patterns.flights;

public class FlightBy implements FlightSearch {
    public void flightFind(FlightRequest flightRequest) {

        System.out.println("Flights from: " + flightRequest.getFlight().getDepartureAirport() +
                " to: " + flightRequest.getFlight().getArrivalAirport() +
                " with layover in: " + flightRequest.getLayover());
        FlightDatabase.flights().stream()
                .filter(fly -> fly.getDepartureAirport().equals(flightRequest.getFlight().getDepartureAirport()))
                .filter(fly -> fly.getArrivalAirport().equals(flightRequest.getLayover()))
                .forEach(s -> System.out.println(s));

        FlightDatabase.flights().stream()
                .filter(fly -> fly.getDepartureAirport().equals(flightRequest.getLayover()))
                .filter(fly -> fly.getArrivalAirport().equals(flightRequest.getFlight().getArrivalAirport()))
                .forEach(z -> System.out.println(z));
    }
}
