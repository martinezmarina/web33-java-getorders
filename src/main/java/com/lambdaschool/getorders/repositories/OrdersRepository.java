package com.lambdaschool.getorders.repositories;

import com.lambdaschool.getorders.models.Customer;
import com.lambdaschool.getorders.models.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Order, Long> {
@Query(value = "SELECT o from Order o WHERE o.advanceamount > 0.00")
    public List<Order> getByAdvanceamountGreaterThanQuery();

}
