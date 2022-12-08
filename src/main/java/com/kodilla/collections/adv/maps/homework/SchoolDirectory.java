package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> list = new HashMap<>();
        Principal legionowPolskich = new Principal("Ryszard", "Zajac", "Legionow Polskich");
        Principal kochanowskiego = new Principal("Maryla", "Rodowicz", "Kochanowskiego");
        Principal curie = new Principal("Edward", "Niemily", "Marii Sklodowskiej Curie");
        Principal janPablo = new Principal("Adrzej", "Ciasny", "Jana Pablo II");
        Principal mickiewicza = new Principal("Jacek", "Domanski", "Adama Mickiewicza");

        School legionowPolskichStudents = new School(Arrays.asList(30, 26, 25, 30, 22));
        School kochanowskiegoStudents = new School(Arrays.asList(28, 30, 22, 33));
        School curieStudents = new School(Arrays.asList(22, 35, 32, 23, 25));
        School janPabloStudents = new School(Arrays.asList(34, 32, 33, 29, 28));
        School mickiewiczaStudents = new School(Arrays.asList(26, 33, 23, 26, 29, 23));

        list.put(legionowPolskich, legionowPolskichStudents);
        list.put(kochanowskiego, kochanowskiegoStudents);
        list.put(curie, curieStudents);
        list.put(janPablo, janPabloStudents);
        list.put(mickiewicza, mickiewiczaStudents);

        for (Map.Entry<Principal, School> principalEntry : list.entrySet()) {
            System.out.println( "Principal " + "" +principalEntry.getKey().getFirstName() + " " + principalEntry.getKey().getLastName() + " " + "School" + " " + principalEntry.getKey().getNameSchool() + " " + "Students" + " " + principalEntry.getValue().getSum());
        }
    }
}