package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@Component
@Scope("prototype")
public class Cart {
    @Autowired
    ProductRepository productRepository;
    private List<Product> cartProducrs;
    Scanner scanner = new Scanner(System.in);
    public Cart() {
        cartProducrs = new ArrayList<>();
    }
    public void addProductToCart(){
        System.out.println("виберіть продукт");
        System.out.println(productRepository.getAll());
        int id =scanner.nextInt();
        Product product = productRepository.getById(id);
        cartProducrs.add(product);
    }
    public void removeProductFromCart(int id){
        cartProducrs.removeIf(product -> product.getId()==id);
    }
    public List<Product> getProductsFromCart(){
        return cartProducrs;
    }
}
