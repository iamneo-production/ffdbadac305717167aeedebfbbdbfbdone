package com.example.service;

import com.example.model.Product;

public interface ProductService {
    Product getProductById(Long id);
    Product createProduct(Product product);
}
