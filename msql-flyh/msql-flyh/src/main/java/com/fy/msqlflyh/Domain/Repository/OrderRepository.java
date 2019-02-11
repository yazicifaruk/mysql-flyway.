package com.fy.msqlflyh.Domain.Repository;

import com.fy.msqlflyh.Domain.Customer;
import com.fy.msqlflyh.Domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>{
    Customer findByCustomer(Customer customer);
}
