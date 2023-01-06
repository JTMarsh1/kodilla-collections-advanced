package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Leon Zawodowiec", null));
        studentList.add(new Student("Pawel Graja", new Teacher("Andrzej Piaseczny")));
        studentList.add(new Student("Marcin Kosakiewicz", null));
        studentList.add(new Student("Radek Baran", new Teacher("Grzegorz Doberman")));

        for (Student student : studentList) {
            String undefinied = getTeacherName(student);
            System.out.println("Student: " + student.getName() + ", Teacher: " + "" + undefinied);
        }
    }

    public static String getTeacherName(Student student) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String undefined = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        return undefined;
    }
}