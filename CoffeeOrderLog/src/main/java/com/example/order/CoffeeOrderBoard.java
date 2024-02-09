package com.example.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class CoffeeOrderBoard {
    private static final Logger logger = LoggerFactory.getLogger(CoffeeOrderBoard.class);
    Queue<Order> orders = new LinkedList<>();

 public void add(String name) {
     logger.info("add new order with name {}", name);
     Order order = new Order(name);
     order.setId(Order.number++);
     orders.add(order);
 }
 public Order deliver(){
     logger.info("deliver order with name {}", orders.peek().getName());
     return orders.poll();
 }
 public void deliver(int number){
     logger.info("deliver order with number {}", number);
     Iterator<Order> iterator = orders.iterator();
     Order delOrder;
     while (iterator.hasNext()){
         delOrder = iterator.next();
         if(delOrder.getId()==number){
             iterator.remove();
         }
     }
 }
 public void draw () {
     logger.info("queue orders");
     try {
         for (Order order: orders) {
             System.out.println(order.getId()+" | "+order.getName());
         }
     } catch (Exception e){
         logger.error("orders empty {}", e.getMessage());
     }
    }
}
