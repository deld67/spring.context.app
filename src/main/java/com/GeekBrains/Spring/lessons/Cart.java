package com.geekbrains.spring.lessons;

import java.util.List;

public class Cart {
    private Long id;
    private List<Product> products;

    public Cart(Long id, List<Product> products) {
        this.id = id;
        this.products = products;
    }
}
