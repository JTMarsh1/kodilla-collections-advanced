package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    private String departure;
    private String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String addFlightTo(String arrival) {
        return arrival;
    }

    public String addFlightFrom(String departure) {
        return departure;
    }
}