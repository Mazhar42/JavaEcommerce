package dev.ecommerce.db;

import dev.ecommerce.model.Product;
import dev.ecommerce.cart.CartItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaticDB {
    public static Map<Integer,List<CartItem>> cart = new HashMap<>();
    public static List<Product> products = new ArrayList<>();

    public static void initDB(){
        products.add(new Product(1L,"101001","Hp elitebook G5", "Laptop",500.00));
        products.add(new Product(2L,"101002","Asus", "Laptop",700.00));
        products.add(new Product(3L,"101003","One Plus 9 pro", "Mobile Phone",600.00));
        products.add(new Product(4L,"101004","LG g7 ThinQ", "Mobile Phone",300.00));
    }
}
