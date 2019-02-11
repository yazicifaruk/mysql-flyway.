package com.fy.msqlflyh.Domain.Repository;

import com.fy.msqlflyh.Domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>{
    Product findByName(String name);
}
