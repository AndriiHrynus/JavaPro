package com.example.model;
import lombok.Data;
import java.util.List;
@Data
public class Order {
    private int id=0;
    private String date;
    private double cost;
    private List<Product> products;
}
