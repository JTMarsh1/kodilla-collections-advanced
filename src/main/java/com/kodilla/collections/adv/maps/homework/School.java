package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> students = new ArrayList<>();

    public School(List<Integer> students) {
        this.students = students;
    }

    public double getSum() {
        double sum = 0.0;
        for (double students : students)
            sum += students;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
