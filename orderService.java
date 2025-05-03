package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Order;

@Service
public class OrderService {

    public Order createOrder() {
        Order order = new Order();
        order.setId(12345);
        order.setProductName("Smartphone");
        order.setQuantity(2);
        return order;
    }
}
