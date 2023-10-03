package com.example.repository;

import com.example.model.Product;

public interface ProductRepository {
    Product findById(Long id);
    Product save(Product product);
}
