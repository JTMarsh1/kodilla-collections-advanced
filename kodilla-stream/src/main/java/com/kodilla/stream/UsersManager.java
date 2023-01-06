package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<String> usersOlderThan40 = filterUsersAges();
        System.out.println(usersOlderThan40);

        List<String> numberOfPost = filterUsersNoPost();
        System.out.println(numberOfPost);

    }

    static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    static List<String> filterUsersAges() {
        List<String> userage = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() > 40)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return userage;
    }

    static List<String> filterUsersNoPost() {
        List<String> userspost = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getNumberOfPost() == 0)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return userspost;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}