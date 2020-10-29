package com.demis.springsql.demo.model;

public class ProductResult {
        private String productName;
        private String erte;

    public ProductResult(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }
}
