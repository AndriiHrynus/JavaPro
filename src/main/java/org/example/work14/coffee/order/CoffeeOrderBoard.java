package org.example.work14.coffee.order;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class CoffeeOrderBoard {
    Queue<Order> orders = new LinkedList<>();

 public void add(String name){
     Order order = new Order(name);
     order.setId(Order.number++);
     orders.add(order);
 }
 public Order deliver(){
     return orders.poll();
 }
 public void deliver(int number){
     Iterator<Order> iterator = orders.iterator();
     Order delOrder;
     while (iterator.hasNext()){
         delOrder = iterator.next();
         if(delOrder.getId()==number){
             System.out.println("Delete: "+delOrder);
             iterator.remove();
         }
     }
 }
 public void draw () {
     for (Order order: orders) {
         System.out.println(order.getId()+" | "+order.getName());
     }
    }
}
