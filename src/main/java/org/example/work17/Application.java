package org.example.work17;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static List<Product> booksToMore250(List<Product> products){
        return products.stream()
                .filter(p -> p.getType().equals("book")&& p.getPrice()>250)
                .collect(Collectors.toList());
    }
    private static List<Product> booksIsDiscount(List<Product> products){
        return products.stream()
                .filter(p -> p.getType().equals("book")&& p.isDiscount())
                .peek(p -> p.setPrice(p.getPrice()*0.9))
                .collect(Collectors.toList());
    }
    public static Product minPriceBook(List<Product> products){
        return products.stream()
                .filter(p -> p.getType().equals("book"))
                .min((p1,p2)->(int) (p1.getPrice()- p2.getPrice()))
                .orElseThrow(()->new NoSuchElementException("Продукт [категорія: Book] не знайдено"));
    }
    public static List<Product> lastThree(List<Product> products){
        return products.stream()
                .sorted(Comparator.comparing(Product::getAddDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
    public static double totalPrice(List<Product> products){
        return products.stream()
                .filter(p -> p.getAddDate().getYear()==2023)
                .filter(p -> p.getType().equals("book"))
                .filter(p -> p.getPrice()<=75)
                .mapToDouble(Product::getPrice)
                .sum();
    }
    public static Map<String,List<Product>> mapGroup(List<Product> products){
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
