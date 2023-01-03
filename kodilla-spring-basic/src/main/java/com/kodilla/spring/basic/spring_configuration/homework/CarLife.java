package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

@Configuration
@Primary
public class CarLife {

    @Bean
    @Scope("prototype")
    public Car choseCar() {
        boolean turnOn = LocalTime.now().isAfter(LocalTime.of(20, 00, 00)) && LocalTime.now().isBefore(LocalTime.of(06, 00, 00));
        LocalDate time = LocalDate.now();
        if (time.getMonth() == Month.APRIL || time.getMonth() == Month.JUNE) {
            return new Cabrio();
        } else if (time.getMonth() == Month.AUGUST || time.getMonth() == Month.DECEMBER) {
            return new Sedan();
        } else {
            return new SUV();
        }
    }
}