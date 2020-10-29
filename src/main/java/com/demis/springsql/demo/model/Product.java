package com.demis.springsql.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Product {
    private Integer id;
    private String productName;
    private BigDecimal unitPrice;
    private String packages;
    private Boolean isDiscontinued;
    private Supplier supplier;

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "ProductName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "UnitPrice")

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "Packages")
    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    @Basic
    @Column(name = "IsDiscontinued")
    public Boolean getDiscontinued() {
        return isDiscontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        isDiscontinued = discontinued;
    }

    @ManyToOne
    @JoinColumn(name = "SupplierId", referencedColumnName = "Id", nullable = false)
    @JsonManagedReference
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

}
