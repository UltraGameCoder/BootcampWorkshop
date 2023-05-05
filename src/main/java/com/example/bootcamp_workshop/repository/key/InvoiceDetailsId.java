package com.example.bootcamp_workshop.repository.key;

import com.example.bootcamp_workshop.model.Invoice;
import com.example.bootcamp_workshop.model.Product;
import javax.persistence.Column;

import java.io.Serializable;
import java.util.Objects;

public class InvoiceDetailsId implements Serializable {

    private Invoice invoiceId;
    private Product productId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvoiceDetailsId)) return false;
        InvoiceDetailsId that = (InvoiceDetailsId) o;
        return Objects.equals(getInvoiceId(), that.getInvoiceId()) && Objects.equals(getProductId(), that.getProductId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInvoiceId(), getProductId());
    }
}
