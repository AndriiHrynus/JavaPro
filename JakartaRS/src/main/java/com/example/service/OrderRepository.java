package com.example.service;
import com.example.model.Order;
import java.util.ArrayList;
import java.util.List;
public class OrderRepository implements OrderRepositoryI{
    private final List<Order> orders = new ArrayList<>();
    @Override
    public Order getById(int orderId) {
        Order orderFind = orders.stream().filter(order -> order.getId() == orderId).findFirst().orElse(null);
        return orderFind;
    }
    @Override
    public List<Order> getAll() {
        return orders;
    }
    @Override
    public void add(Order order) {
        orders.add(order);
    }
}
