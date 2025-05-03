package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.model.Product;

@Repository
public class ProductRepository {

    public Product findProductByName(String name) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(499.99);
        return product;
    }
}
