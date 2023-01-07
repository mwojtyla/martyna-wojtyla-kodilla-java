package com.kodilla.good.patterns.flights;

public class FlightSevice {
    FlightTo flightTo;
    FlightFrom flightFrom;
    FlightBy flightBy;

    public FlightSevice(FlightTo flightTo, FlightFrom flightFrom, FlightBy flightBy) {
        this.flightTo = flightTo;
        this.flightFrom = flightFrom;
        this.flightBy = flightBy;
    }

    public boolean flightsFind(FlightRequest flightRequest) {
        if (!"".equals(flightRequest.getFlight().getDepartureAirport())
                && "".equals(flightRequest.getFlight().getArrivalAirport())
                && "".equals(flightRequest.getLayover())) {
            flightFrom.flightFind(flightRequest);
            return true;

        } else if ("".equals(flightRequest.getFlight().getDepartureAirport())
                && !"".equals(flightRequest.getFlight().getArrivalAirport())
                && "".equals(flightRequest.getLayover())) {
            flightTo.flightFind(flightRequest);
            return true;

        } else if (!"".equals(flightRequest.getFlight().getDepartureAirport())
                && !"".equals(flightRequest.getFlight().getArrivalAirport())
                && !"".equals(flightRequest.getLayover())) ;
            flightBy.flightFind(flightRequest);
            return true;
    }
}
