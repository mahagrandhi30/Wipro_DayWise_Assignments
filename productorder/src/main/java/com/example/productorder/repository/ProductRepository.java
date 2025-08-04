package com.example.productorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.productorder.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
