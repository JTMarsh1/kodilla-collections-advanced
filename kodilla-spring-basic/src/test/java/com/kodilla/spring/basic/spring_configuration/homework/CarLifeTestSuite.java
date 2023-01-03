package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.homework.Car;
import com.kodilla.spring.basic.spring_configuration.homework.SUV;
import com.kodilla.spring.basic.spring_configuration.homework.Sedan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

@SpringBootTest
public class CarLifeTestSuite {

    @Test
    public void checkIfLightsIsTurnOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("choseCar");
        boolean lights = car.hasHeadlightsTurnedOn();
        boolean turnOn = LocalTime.now().isAfter(LocalTime.of(20, 00, 00)) && LocalTime.now().isBefore(LocalTime.of(06, 00, 00));
        if (turnOn) {
            Assertions.assertTrue(lights);
        } else {
            Assertions.assertFalse(lights);
        }
    }

    @Test
    public void checkIfItsCorrectCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("choseCar");
        LocalDate time = LocalDate.now();
        if (time.getMonth() == Month.APRIL || time.getMonth() == Month.JUNE) {
            Assertions.assertEquals("Cabrio", car.getCarType());
        } else if (time.getMonth() == Month.AUGUST || time.getMonth() == Month.DECEMBER) {
            Assertions.assertTrue(car instanceof Sedan);
        } else {
            Assertions.assertEquals("SUV", car.getCarType());
            Assertions.assertTrue(car instanceof SUV);
        }
    }
}