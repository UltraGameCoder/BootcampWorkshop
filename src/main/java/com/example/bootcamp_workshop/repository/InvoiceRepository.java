package com.example.bootcamp_workshop.repository;

import com.example.bootcamp_workshop.model.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {
}
