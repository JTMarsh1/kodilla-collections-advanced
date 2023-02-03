package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {

    private static Stream<Arguments> provideDataForBMI() {
        return Stream.of(
                Arguments.of(new Person(150, 36), "Underweight"),
                Arguments.of(new Person(155, 58), "Normal (healthy weight)"),
                Arguments.of(new Person(168, 70), "Normal (healthy weight)"),
                Arguments.of(new Person(170, 78), "Normal (healthy weight)"),
                Arguments.of(new Person(175, 92), "Overweight"),
                Arguments.of(new Person(180, 119), "Overweight"),
                Arguments.of(new Person(165, 94), "Obese Class I (Moderately obese)"
                ));
    }
}