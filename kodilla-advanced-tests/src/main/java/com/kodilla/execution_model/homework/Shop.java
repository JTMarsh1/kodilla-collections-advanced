package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    public Set<Order> orderSet = new HashSet<>();

    public void addOrder(Order order) {

        this.orderSet.add(order);
    }

    public Order getOrder(int index) {
        return orderSet
                .stream()
                .filter(o -> o.equals(orderSet))
                .collect(Collectors.toSet())
                .iterator()
                .next();

    }

    public Set<Order> getOrderByDate(LocalDate from, LocalDate to) {
        Set<Order> result = new HashSet<>();
        for (Order order : orderSet) {
            if (order.getOrderDate().isAfter(from) && order.getOrderDate().isBefore(to)) {
                result.add(order);
            }
        }
        return result;
    }

    public Set<Order> getOrderByValue(double minValue, double maxValue) {
        Set<Order> result2 = new HashSet<>();
        for (Order order : orderSet) {
            if (order.getValue() >= minValue && order.getValue() <= maxValue) {
                result2.add(order);
            }
        }
        return result2;
    }

    public int getSize() {
        return this.orderSet.size();
    }

    public double getSumOfAllOrder() {
        return orderSet
                .stream()
                .map(Order::getValue)
                .mapToDouble(Double::doubleValue)
                .sum();
    }
}