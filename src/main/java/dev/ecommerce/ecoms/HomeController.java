package dev.ecommerce.ecoms;

import dev.ecommerce.cart.Cart;
import dev.ecommerce.cart.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import dev.ecommerce.model.Product;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.ui.Model;


import java.util.Arrays;

@Controller
public class HomeController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("")
    public String index(Model model){
        String uri = "http://localhost:8080/api/v1/products";
        ResponseEntity<Product[]> response = restTemplate.getForEntity(uri, Product[].class);
        Product[] products = response.getBody();
        model.addAttribute("products",products);
        return "home";
    }

    @GetMapping("/checkout")
    public String checkout(Model model){
        String uri = "http://localhost:8080/api/v1/cart/all";
        ResponseEntity<CartItem[]> response = restTemplate.getForEntity(uri, CartItem[].class);
        CartItem[] cartItems = response.getBody();
        model.addAttribute("cartItems",cartItems);
        return "test";
    }
}

