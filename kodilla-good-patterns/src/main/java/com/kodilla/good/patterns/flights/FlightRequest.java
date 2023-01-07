package com.kodilla.good.patterns.flights;

public class FlightRequest {
    Flight flight;
    String layover;

    public FlightRequest(Flight flight, String layover) {
        this.flight = flight;
        this.layover = layover;
    }

    public Flight getFlight() {
        return flight;
    }

    public String getLayover() {
        return layover;
    }
}
