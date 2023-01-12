package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnCorrectNumbers(String excepted) throws InvalidNumbersException {
        String[] numbers = excepted.split(",");
        Set<String> setNumbers = new HashSet<>(Arrays.asList(numbers));
        Set<Integer> correctNumbers = setNumbers
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        int result = gamblingMachine.howManyWins(correctNumbers);
        assertTrue(result >= 0 && result <= 6);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/incorrectNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnIfNumbersAreInncorrect(int a, int b, int c, int d, int e, int f) throws InvalidNumbersException {
        Set<Integer> incorrectNumbers = new HashSet<>();
        incorrectNumbers.add(a);
        incorrectNumbers.add(b);
        incorrectNumbers.add(c);
        incorrectNumbers.add(d);
        incorrectNumbers.add(e);
        incorrectNumbers.add(f);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(incorrectNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/incorrectNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnIfNumbersAreCorrect2(String excepted) throws InvalidNumbersException {
        String[] numbers = excepted.split(",");
        Set<String> setNumbers = new HashSet<>(Arrays.asList(numbers));
        Set<Integer> incorrectNumbers = setNumbers
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        int result = gamblingMachine.howManyWins(incorrectNumbers);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(incorrectNumbers));
    }

    @ParameterizedTest
    @ValueSource(ints = {13})
    public void shouldThrowInvalidNumberExceptionWhenOnlyOneNumberGiven(int a) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>(a);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/notEnough.csv", numLinesToSkip = 1)
    public void shouldThrowWhenNotEnoughNumbers(String expected) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> lessNumbers = convert(expected);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(lessNumbers));
    }

    private Set<Integer> convert(String expected) {
        String[] strings = expected.split(",");

        Set<Integer> results = new HashSet<>();
        for (String numbers : strings) {
            Integer number = Integer.parseInt(numbers);
        }
        return results;
    }
}