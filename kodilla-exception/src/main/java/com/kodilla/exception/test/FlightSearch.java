package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("Berlin", true);
        flightsMap.put("Madrid", false);
        flightsMap.put("London", true);
        flightsMap.put("Oslo", false);

         if (flightsMap.containsKey(flight.getArrivalAirport())) {
                System.out.println("Possibility of arrival at the airport in " + flight.getArrivalAirport() + ": " + flightsMap.get(flight.getArrivalAirport()));
         } else {
             throw new RouteNotFoundException();
         }

    }

}
