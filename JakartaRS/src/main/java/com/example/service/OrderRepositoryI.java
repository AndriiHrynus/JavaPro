package com.example.service;
import com.example.model.Order;
import java.util.List;
public interface OrderRepositoryI {
    Order getById(int orderId);
    List<Order> getAll();
    void add(Order order);
}
