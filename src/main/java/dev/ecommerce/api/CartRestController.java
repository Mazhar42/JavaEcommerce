package dev.ecommerce.api;

import dev.ecommerce.cart.CartItem;
import dev.ecommerce.db.StaticDB;
import dev.ecommerce.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cart")
public class CartRestController {
    @GetMapping("/add/{productID}")
    public List<CartItem> addToCart(@PathVariable long productID){
        Product product = StaticDB.products.stream().filter(p->p.getId()==productID).findFirst().get();
        int UserID = 1;
        List<CartItem> temp = new ArrayList<>();
        if(StaticDB.cart.get(UserID)==null){
            temp.add(new CartItem(product.getId(),product.getId(),product.getName(),product.getPrice(),1));
            StaticDB.cart.put(UserID,temp);
        }else if(StaticDB.cart.get(UserID)!=null){
            Optional<CartItem> optionalItem = StaticDB.cart.get(UserID).stream().filter(x->x.getProductID()==product.getId()).findFirst();
            if(optionalItem.isPresent()){
                CartItem item = optionalItem.get();
                item.setQty(item.getQty()+1);
            }else{
                StaticDB.cart.get(UserID).add(new CartItem(product.getId(),product.getId(),product.getName(),product.getPrice(),1));
            }
        }

        return StaticDB.cart.get(UserID);
    }

    @GetMapping("/all")
    public List<CartItem> allCartItem(){
        int UserID = 1;
        return StaticDB.cart.get(UserID);
    }
}
