package com.example.productorder.entity;

import jakarta.persistence.*;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private int quantity;

    public OrderEntity() {}

    public OrderEntity(Long id, String productName, int quantity) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
