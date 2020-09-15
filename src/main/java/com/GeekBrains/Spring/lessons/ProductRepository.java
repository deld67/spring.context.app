package com.geekbrains.spring.lessons;


import java.util.List;

public interface ProductRepository {
     List<Product> findAll();
     Product findProductById(Long id);

}
