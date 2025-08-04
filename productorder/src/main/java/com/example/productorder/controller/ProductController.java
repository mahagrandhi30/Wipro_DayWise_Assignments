package com.example.productorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.productorder.entity.ProductEntity;
import com.example.productorder.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")  // <--- This is important
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ProductEntity addProduct(@RequestBody ProductEntity product) {
        return productService.saveProduct(product);
    }

    @GetMapping
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }
}
