package com.example.bootcamp_workshop.repository;

import com.example.bootcamp_workshop.model.InvoiceDetails;
import com.example.bootcamp_workshop.repository.key.InvoiceDetailsId;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDetailsRepository extends CrudRepository<InvoiceDetails, InvoiceDetailsId> {
}
