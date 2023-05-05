package com.example.bootcamp_workshop.model;

import com.example.bootcamp_workshop.repository.key.InvoiceDetailsId;
import jakarta.persistence.*;

@Entity
@Table(name = "invoice_details")
@IdClass(InvoiceDetailsId.class)
public class InvoiceDetails {

    @Id
    @ManyToOne()
    @JoinColumn(nullable = false)
    private Invoice invoiceId;
    @Id
    @ManyToOne()
    @JoinColumn(nullable = false)
    private Product productId;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double totalPrice;

    public InvoiceDetails(Invoice invoiceId, Product productId, int quantity, double totalPrice) {
        this.invoiceId = invoiceId;
        this.productId = productId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public InvoiceDetails() {
    }

    public Invoice getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Invoice invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
