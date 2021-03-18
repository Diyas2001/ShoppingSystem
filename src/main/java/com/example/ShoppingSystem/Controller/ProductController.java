package com.example.ShoppingSystem.Controller;

import com.example.ShoppingSystem.Services.ProductsService;
import com.example.ShoppingSystem.Tables.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductsService productsService;

    @GetMapping("/list")
    public List<Products> getAllProducts() {
        return productsService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Products getProductById(@PathVariable("id") Long id) {
        return productsService.getProductById(id).get();
    }

    @PostMapping("")
    public void addProduct(@RequestBody Products products) {
        productsService.addProducts(products);
    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable Long id,
                           @RequestBody Products products) {
        productsService.updateProduct(id, products);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        productsService.deleteProduct(id);
    }


}
