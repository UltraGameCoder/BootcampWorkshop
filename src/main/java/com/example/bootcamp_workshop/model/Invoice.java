package com.example.bootcamp_workshop.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int invoiceId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Customer customerId;

    @Column(nullable = false)
    private LocalDateTime invoiceDate;

    public Invoice(@NotNull Customer customerId, @NotNull LocalDateTime invoiceDate) {
        this.customerId = customerId;
        this.invoiceDate = invoiceDate;
    }

    public Invoice() {
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
}
