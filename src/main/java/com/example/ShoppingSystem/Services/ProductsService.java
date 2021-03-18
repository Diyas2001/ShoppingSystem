package com.example.ShoppingSystem.Services;

import com.example.ShoppingSystem.DataAccessObject.ProductRep;
import com.example.ShoppingSystem.Services.Interfaces.ProductsServiceIn;
import com.example.ShoppingSystem.Tables.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class ProductsService implements ProductsServiceIn {

    @Autowired
    private ProductRep productRep;

    @Override
    public void addProducts(Products products) {
        productRep.saveAndFlush(products);
    }

    @Override
    public void deleteProduct(Long id) {
        productRep.deleteById(id);
    }

    @Override
    public void updateProduct(Long id, Products products) {
        products.setId(id);
        productRep.saveAndFlush(products);
    }

    @Override
    public Optional<Products> getProductById(Long id) {
        return productRep.findById(id);
    }

    @Override
    public List<Products> getAllProducts() {
        return productRep.findAll();
    }
}
