package com.example.productorder;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import com.example.productorder.entity.ProductEntity;
import com.example.productorder.repository.ProductRepository;
import com.example.productorder.service.ProductService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllProducts() {
        ProductEntity p1 = new ProductEntity(1L, "Laptop", 999.99);
        ProductEntity p2 = new ProductEntity(2L, "Phone", 499.99);
        when(productRepository.findAll()).thenReturn(Arrays.asList(p1, p2));

        List<ProductEntity> products = productService.getAllProducts();

        assertEquals(2, products.size());
        assertEquals("Laptop", products.get(0).getName());
    }
}
