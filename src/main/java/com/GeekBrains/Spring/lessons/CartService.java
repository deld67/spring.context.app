package com.geekbrains.spring.lessons;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CartService {
    private ProductService productService;

    public CartService(ProductService productService) {
        this.productService = productService;
    }

    public Cart createCartFromProductId(Long productId) {
        List<Product> products = new ArrayList<>( Arrays.asList(productService.findProductById( productId)));
        return new Cart(1L, products);
    }

}
