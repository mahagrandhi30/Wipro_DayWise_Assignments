package com.example.productorder.controller;

import com.example.productorder.dto.OrderRequest;
import com.example.productorder.entity.OrderEntity;
import com.example.productorder.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public OrderEntity createOrder(@RequestBody OrderRequest request) {
        return productService.placeOrder(request.getProductId(), request.getQuantity());
    }
}
