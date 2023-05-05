package com.example.bootcamp_workshop.repository;

import com.example.bootcamp_workshop.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
