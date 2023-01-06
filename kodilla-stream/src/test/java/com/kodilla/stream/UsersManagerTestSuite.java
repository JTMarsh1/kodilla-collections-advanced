package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UsersManagerTestSuite {

    @Test
    public void testShowChemistGroupName() {
        List<String> result = UsersManager.filterChemistGroupUsernames();
        List<String> expected = new ArrayList<>();
        expected.add("Walter White");
        expected.add("Gale Boetticher");
        assertEquals(expected, result);
    }

    @Test
    public void testShowOlderThan40() {
        List<String> result = UsersManager.filterUsersAges();
        List<String> expected = new ArrayList<>();
        expected.add("Walter White");
        expected.add("Gus Firing");
        expected.add("Gale Boetticher");
        expected.add("Mike Ehrmantraut");
        assertEquals(expected, result);

    }

    @Test
    public void testShowUsersNoPost() {
        List<String> result = UsersManager.filterUsersNoPost();
        List<String> expected = new ArrayList<>();
        expected.add("Gus Firing");
        expected.add("Mike Ehrmantraut");
        assertEquals(expected, result);
    }

}