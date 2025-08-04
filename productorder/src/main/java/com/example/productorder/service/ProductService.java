package com.example.productorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productorder.entity.OrderEntity;
import com.example.productorder.entity.ProductEntity;
import com.example.productorder.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductEntity saveProduct(ProductEntity product) {
        return productRepository.save(product);
    }

	public OrderEntity placeOrder(Long productId, int quantity) {
		return null;
	}
}
