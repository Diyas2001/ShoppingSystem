package com.example.ShoppingSystem.Controller;

import com.example.ShoppingSystem.Services.ProductsService;
import com.example.ShoppingSystem.Tables.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductsService productsService;

    @ResponseBody
    @GetMapping("/list")
    public List<Products> getAllProducts() {
        return productsService.getAllProducts();
    }

    @GetMapping("/allProductsPage")
    public String allProductsPage(Model model){
        model.addAttribute("products", getAllProducts());
        return "productList";
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Products getProductById(@PathVariable("id") Long id) {
        return productsService.getProductById(id).get();
    }

    @ResponseBody
    @PostMapping("")
    public void addProduct(@RequestBody Products products) {
        productsService.addProducts(products);
    }

    @ResponseBody
    @PutMapping("/{id}")
    public void updateProduct(@PathVariable Long id,
                           @RequestBody Products products) {
        productsService.updateProduct(id, products);
    }

    @ResponseBody
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        productsService.deleteProduct(id);
    }


}
