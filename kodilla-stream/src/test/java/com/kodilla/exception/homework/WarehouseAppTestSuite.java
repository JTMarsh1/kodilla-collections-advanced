package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test

    public void testGetOrder_withException() {
        Warehouse warehouse = new Warehouse();

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("900"));

    }

    @Test
    public void TestGetOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1234"));

        Order expected = warehouse.getOrder("1234");

        Order expected2 = warehouse.getOrder("1234");
        assertNotNull(expected);
    }
}