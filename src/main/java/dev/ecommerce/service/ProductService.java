package dev.ecommerce.service;

import dev.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts() {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1L,"1011001","Product 1","Laptop", 10.99));
        products.add(new Product(2L,"1011002","Product 2","Laptop", 20.99));

        return products;
    }
}

