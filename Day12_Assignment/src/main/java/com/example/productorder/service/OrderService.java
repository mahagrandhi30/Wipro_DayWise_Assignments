package com.example.productorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productorder.entity.OrderEntity;
import com.example.productorder.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    public OrderEntity saveOrder(OrderEntity order) {
        return orderRepository.save(order);
    }
}
