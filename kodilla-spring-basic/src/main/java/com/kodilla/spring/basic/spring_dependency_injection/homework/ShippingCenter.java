package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.dependency_injection.homework.DeliveryService;

import javax.annotation.Resource;

public class ShippingCenter {

    @Resource(name = "notificationService")
    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}