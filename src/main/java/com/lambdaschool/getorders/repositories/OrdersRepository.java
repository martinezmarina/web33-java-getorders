package com.lambdaschool.getorders.repositories;

import com.lambdaschool.getorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, Long> {
}
