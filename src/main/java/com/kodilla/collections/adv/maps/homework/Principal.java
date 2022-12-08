package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstName;
    private String lastName;
    private String nameSchool;

    public Principal(String firstName, String lastName, String nameSchool) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nameSchool = nameSchool;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstName, principal.firstName) && Objects.equals(lastName, principal.lastName) && Objects.equals(nameSchool, principal.nameSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, nameSchool);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nameSchool='" + nameSchool + '\'' +
                '}';
    }
}