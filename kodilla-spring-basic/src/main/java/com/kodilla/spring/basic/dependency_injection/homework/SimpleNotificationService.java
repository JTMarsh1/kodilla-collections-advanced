package com.kodilla.spring.basic.dependency_injection.homework;

public interface SimpleNotificationService {

    void success(String address);

    void fail(String address);
}