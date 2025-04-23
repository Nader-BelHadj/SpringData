package com.fst.SpringData.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fst.SpringData.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Long> {

}
