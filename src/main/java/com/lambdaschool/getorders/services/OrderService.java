package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Order;

import java.util.List;

public interface OrderService {
    Order findOrderById(long id);
    Order save(Order order);
    List<Order> getadvanceamount();
}
