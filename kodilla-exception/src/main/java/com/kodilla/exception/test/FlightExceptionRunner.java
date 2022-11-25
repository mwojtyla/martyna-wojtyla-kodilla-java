package com.kodilla.exception.test;

public class FlightExceptionRunner {

    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight = new Flight("Paris", "Vienna");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight);

        } catch (RouteNotFoundException e) {
            System.out.println("There is no flight for this airport.");
        } finally {
            System.out.println("End of search.");
        }




    }
}
