package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTestSuite {

    @Test
    public void testGetTeacherName(){
        Teacher teacher = new Teacher("Andrzej Piaseczny");
        Student student1 = new Student("Pawel Graja", teacher);

        Application.getTeacherName(student1);
        assertEquals(teacher, Application.getTeacherName(student1));
    }

    @Test
    public void testNoTeacher(){
        Student student = new Student("Pawel Graja", null);
        Application.getTeacherName(student);
        assertEquals("<underFined>", Application.getTeacherName(student));
    }
}