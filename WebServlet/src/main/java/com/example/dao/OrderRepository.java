package com.example.dao;
import com.example.entity.Order;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class OrderRepository implements OrderDAO{
private List<Order> orders = new ArrayList<>();
    @Override
    public Order getOrderById(int id) {
        Order orderFind = orders.stream().filter(order -> order.getId() == id).findFirst().orElse(null);
        return orderFind;
    }
    @Override
    public List<Order> getAllOrders() {
        return orders;
    }
    @Override
    public void addOrder(Order order) {
        System.out.println("puts");
        orders.add(order);
    }
}
