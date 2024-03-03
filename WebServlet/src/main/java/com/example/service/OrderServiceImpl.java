package com.example.service;
import com.example.dao.OrderDAO;
import com.example.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderDAO orderDAO;
    @Override
    public Order getOrderById(int id) {
        return orderDAO.getOrderById(id);
    }
    @Override
    public List<Order> getAllOrders() {
      return orderDAO.getAllOrders();
    }
    @Override
    public void addOrder(Order order) {
        orderDAO.addOrder(order);
    }
}
