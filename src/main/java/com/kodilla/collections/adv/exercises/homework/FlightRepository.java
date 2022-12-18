package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightTable() {
        List<Flight> flightTable = new ArrayList<>();
        flightTable.add(new Flight("Wroclaw", "Rome"));
        flightTable.add(new Flight("Milan", "Wroclaw"));
        flightTable.add(new Flight("Poznan", "Madrid"));
        flightTable.add(new Flight("Warsaw", "Wroclaw"));
        flightTable.add(new Flight("Paris", "Gdansk"));

        return flightTable;
    }
}