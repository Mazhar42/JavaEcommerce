package dev.ecommerce.api;

import dev.ecommerce.db.StaticDB;
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
        return StaticDB.products;
    }

}

