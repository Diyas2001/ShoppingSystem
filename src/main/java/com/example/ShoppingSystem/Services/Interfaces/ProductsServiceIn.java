package com.example.ShoppingSystem.Services.Interfaces;

import com.example.ShoppingSystem.Tables.Products;

import java.util.List;
import java.util.Optional;

public interface ProductsServiceIn {
    void addProducts(Products products);
    void deleteProduct(Long id);
    void updateProduct(Long id, Products products);
    Optional<Products> getProductById(Long id);
    List<Products> getAllProducts();
}
