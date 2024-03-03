package com.example.dao;
import com.example.entity.Order;
import java.util.List;
public interface OrderDAO {
     Order getOrderById(int id);
    List<Order> getAllOrders();
     void addOrder(Order order);

}
