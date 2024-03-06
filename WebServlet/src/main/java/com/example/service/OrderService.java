package com.example.service;
import com.example.entity.Order;
import java.util.List;
public interface OrderService {
    Order getOrderById(int id);
    List<Order> getAllOrders();
    void addOrder(Order order);
}
