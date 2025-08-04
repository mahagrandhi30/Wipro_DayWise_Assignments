package com.example.productorder;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import com.example.productorder.entity.OrderEntity;
import com.example.productorder.repository.OrderRepository;
import com.example.productorder.service.OrderService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class OrderServiceTest {

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllOrders() {
        OrderEntity o1 = new OrderEntity(1L, "Mouse", 2);
        OrderEntity o2 = new OrderEntity(2L, "Keyboard", 1);

        when(orderRepository.findAll()).thenReturn(Arrays.asList(o1, o2));

        List<OrderEntity> orders = orderService.getAllOrders();

        assertEquals(2, orders.size());
        assertEquals("Mouse", orders.get(0).getProductName());
    }
}
