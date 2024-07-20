package com.drools.DemoApp.service;
import com.drools.DemoApp.model.Product;
import java.util.List;
import java.util.Arrays;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(101, "Iphone", 50000), 
        new Product(102, "Samsung", 130000),
        new Product(103, "Asus Rog", 45000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(100, "No Item", 0));
    }   

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i=0; i<products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                index = i;
            }
        }
        products.set(index, prod);        
    }
}
