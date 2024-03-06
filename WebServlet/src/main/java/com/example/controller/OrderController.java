package com.example.controller;
import com.example.entity.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping()
    public List<Order> getAllOrders() {
        System.out.println("ORDERS ALL");
        return orderService.getAllOrders();
    }
    @GetMapping("{id}")
    public Order getOrderById(int id){
        System.out.println("BY ID");
       return orderService.getOrderById(id);
    }
    @PostMapping
    public void addOrder(@RequestBody Order order) {
        System.out.println("POST");
    orderService.addOrder(order);
    }
}
