package com.example.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
@Data
@AllArgsConstructor
public class Order {
   private int id;
   private String date;
   private int cost;
   private List<Product> products;
}
