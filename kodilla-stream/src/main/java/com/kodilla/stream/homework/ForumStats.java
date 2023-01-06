package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println("Average of post over 40 is: " + averageOfPostsOver40(UsersRepository.getUserList()));
        System.out.println("Average of post under 40 is: " +averageOfPostsUnder40(UsersRepository.getUserList()));

    }
    public static double averageOfPostsOver40 (List<User> users){
        double avg = users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }

    public static double averageOfPostsUnder40 (List<User> users) {
        double avg2 = users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg2;
    }
}