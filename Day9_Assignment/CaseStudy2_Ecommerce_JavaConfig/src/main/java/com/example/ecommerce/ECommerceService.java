package com.example.ecommerce;

public class ECommerceService {
    private Product product;
    private Order order;
    private Payment payment;

    public ECommerceService(Product product, Order order, Payment payment) {
        this.product = product;
        this.order = order;
        this.payment = payment;
    }

    public void runEcommerceFlow() {
        product.addProduct();
        order.createOrder();
        payment.processPayment();
    }
}
