package com.example;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepository {
    private List<Product> products;
    public ProductRepository() {
        products = new ArrayList<>();
        products.add(new Product(1,"Product1",100));
        products.add(new Product(2, "Product2", 200));
        products.add(new Product(3, "Product3", 300));
    }
    public List<Product> getAll(){
        return products;
    }
    public Product getById(int id){
        return products.stream().filter(product->product.getId()==id)
                .findFirst()
                .orElse(null);
    }
}
