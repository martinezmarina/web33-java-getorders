package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Customer;
import com.lambdaschool.getorders.models.Order;
import com.lambdaschool.getorders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersRepository orderrepos;

    @Override
    public Order findOrderById(long id) {
        return orderrepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Order " + id + " Not Found"));
    }
    @Override
    public Order save(Order order) {
        return orderrepos.save(order);
    }
    @Override
    public List<Order> getadvanceamount() {
        List<Order> rtnList = new ArrayList<>();
        orderrepos.getByAdvanceamountGreaterThanQuery().iterator().forEachRemaining(rtnList::add);

        return rtnList;
    }
}
