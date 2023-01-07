package com.kodilla.good.patterns.flights;


public class FlightApplication {
    public static void main(String[] args) {

        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest flightRequest = flightRequestRetriever.retrieve();

        FlightSevice flightService = new FlightSevice(new FlightTo(), new FlightFrom(), new FlightBy());
        flightService.flightsFind(flightRequest);

    }
}
