package com.fy.msqlflyh.Domain.Repository;

import com.fy.msqlflyh.Domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
    Customer findByName(String name);
}
