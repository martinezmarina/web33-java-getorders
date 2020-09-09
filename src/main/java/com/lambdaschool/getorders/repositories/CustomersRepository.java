package com.lambdaschool.getorders.repositories;

import com.lambdaschool.getorders.models.Customer;
import com.lambdaschool.getorders.views.OrderCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomersRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByCustnameContainingIgnoringCase(String name);

    @Query(value = "SELECT c.custname AS name, COUNT(ordnum) AS ordercounts " +
            "FROM customers c LEFT JOIN orders o " +
            "ON c.custcode = o.custcode " +
            "GROUP BY c.custname " +
            "ORDER BY ordercounts DESC", nativeQuery = true)
    List<OrderCount> getOrderCount();
}
