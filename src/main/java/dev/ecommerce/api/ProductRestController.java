package dev.ecommerce.api;

import dev.ecommerce.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1/products")

public class ProductRestController {
    @GetMapping("")
    public List<Product> productList(){
        return getAllProducts();
    }

    private List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L,"101001","Hp elitebook G5", "Laptop",499.99));
        products.add(new Product(2L,"101002","Asus", "Laptop",699.99));

        return products;
    }
}

