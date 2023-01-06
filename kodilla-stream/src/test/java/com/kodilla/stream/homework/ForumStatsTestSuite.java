package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class ForumStatsTestSuite {

    @Test
    void testAverageOver40 () {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 25, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 49, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));

        double averageOfPostsOver40 = ForumStats.averageOfPostsOver40(users);

        assertEquals(58, ForumStats.averageOfPostsOver40(users) );
    }

    @Test
    void testAverageUnder40 () {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 25, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 49, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));

        double averageOfPostsUnder40 = ForumStats.averageOfPostsUnder40(users);

        assertEquals(2327.5, ForumStats.averageOfPostsUnder40(users));
    }
}