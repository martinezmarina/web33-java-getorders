package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Customer;
import com.lambdaschool.getorders.views.OrderCount;

import java.util.List;

public interface CustomerService {
    List<Customer> listAllCustomerOrders();
    Customer findCustomerById(long id);
    List<Customer> listCustomersByLikeName(String name);
    List<OrderCount> getOrderCount();
    Customer save(Customer customer);
}
