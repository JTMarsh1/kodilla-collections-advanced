package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1234"));
        warehouse.addOrder(new Order("5678ds"));
        warehouse.addOrder(new Order("9012qp"));
        warehouse.addOrder(new Order("2223aq"));
        warehouse.addOrder(new Order("2332a"));

        try {
            Order isOrderExist = warehouse.getOrder("10");
            System.out.println("Order exist");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesn't exist. Try again");
        } finally {
            System.out.println("Thank you. See you soon");
        }
    }
}