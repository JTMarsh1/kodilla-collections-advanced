package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    void findFlightsFrom() {
        List<Flight> result = FlightFinder.findFlightsFrom("Wroclaw");
        assertEquals(FlightFinder.findFlightsFrom("Krakow"), result);

    }

    @Test
    void findFlightsTo() {
        Flight flight = new Flight("", "");
        flight.addFlightTo("Wroclaw");
        flight.addFlightTo("Milan");
        flight.addFlightTo("Poznan");

        List<Flight> result = FlightFinder.findFlightsTo("Wroclaw");

        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Poznan", "Gdansk"));

        assertEquals(expected, result);

    }

    @Test
    public void checkIfFlightFromExist() {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsFrom("Lublin");
        flightFinder.findFlightsFrom("Paris");


        List<Flight> result = flightFinder.findFlightsFrom("Lublin");
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Lublin", "Wroclaw"));
        assertEquals(expected, result);

    }
}