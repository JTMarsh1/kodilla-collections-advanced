package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.homework.NotificationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {
    @Test
    public void shouldReturnMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.fail("124 zmigrodzka ");
        String message2 = bean.success("8 paprotna");
        Assertions.assertEquals("Package not delivered to: 124 zmigrodzka ", message);
        Assertions.assertEquals("Package delivered to: 8 paprotna ", message2);
    }

    @Test
    public void shouldReturnNotNull() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.success("20 Czartoryskiego");
        Assertions.assertNotNull(message);
    }
}