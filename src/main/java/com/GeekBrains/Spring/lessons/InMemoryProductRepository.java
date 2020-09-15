package com.geekbrains.spring.lessons;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class InMemoryProductRepository implements ProductRepository {
    List<Product> products;

    @PostConstruct
    public void init(){
        products = new ArrayList<>( Arrays.asList(
                new Product(1L, "Car", 25),
                new Product(2L, "Bike", 90),
                new Product(3L, "Rollers", 525),
                new Product(3L, "Skate", 525),
                new Product(3L, "Scooter", 525)

        ));
    }


    @Override
    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }

    @Override
    public Product findProductById(Long id) {
        for (Product product: products) {
            if (product.getId().equals( id )){
                return product;
            }
        }
        throw new RuntimeException("Product not found");
    }
}
