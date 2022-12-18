package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public static List<Flight> findFlightsFrom(String departure) {
        List<Flight> resultDeparture = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightTable()) {
            if (flight.getDeparture().equals(departure)) ;
            resultDeparture.add(flight);
        }
        return resultDeparture;
    }

    public static List<Flight> findFlightsTo(String arrival) {
        List<Flight> resultArrivals = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightTable()) {
            if (flight.getArrival().equals(arrival));
            resultArrivals.add(flight);
        }
        return resultArrivals;
    }
}