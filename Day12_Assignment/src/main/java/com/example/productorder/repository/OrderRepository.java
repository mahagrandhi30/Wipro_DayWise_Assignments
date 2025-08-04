package com.example.productorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.productorder.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
