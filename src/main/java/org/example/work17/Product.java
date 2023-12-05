package org.example.work17;

import java.time.LocalDate;

public class Product {
    private String type;
    private double price;
    private boolean isDiscount;
    private LocalDate addDate;
    public Product(String type, double price, boolean isDiscount) {
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
        this.addDate=LocalDate.now();
    }
    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isDiscount() {
        return isDiscount;
    }
    public LocalDate  getAddDate() {
        return addDate;
    }
    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", isDiscount=" + isDiscount +
                ", addDate=" + addDate +
                '}';
    }
}
