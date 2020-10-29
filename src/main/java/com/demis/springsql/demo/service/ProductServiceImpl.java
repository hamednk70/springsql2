package com.demis.springsql.demo.service;

import com.demis.springsql.demo.model.Product;

public class ProductServiceImpl implements ProductService {
    private final Integer productId;
    private final Integer description;

    public ProductServiceImpl(Integer productId, Integer description) {
        this.productId = productId;
        this.description = description;
    }

    @Override
    public Product getOneProduct(Integer id) {
        return null;
    }
}
