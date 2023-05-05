package com.example.bootcamp_workshop.repository;

import com.example.bootcamp_workshop.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}