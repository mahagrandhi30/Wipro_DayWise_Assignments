package com.example.orderservice3.controller;

import com.example.orderservice3.model.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;
    private static final String TOPIC = "order-topic";

    @Autowired
    public OrderController(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        try {
            String json = objectMapper.writeValueAsString(order);
            kafkaTemplate.send(TOPIC, order.getOrderId(), json);
            return ResponseEntity.ok("Order published to Kafka: " + order.getOrderId());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Error publishing order: " + e.getMessage());
        }
    }
}
