package dev.ecommerce.cart;

import java.util.Objects;

public class CartItem {
    long id;
    long productID;
    String itemName;

    Double price;
    int qty;

    public CartItem(){}
    public CartItem(long id, long productID, String itemName, Double price, int qty) {
        this.id = id;
        this.productID = productID;
        this.itemName = itemName;
        this.price = price;
        this.qty = qty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductID() {
        return productID;
    }


    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return id == cartItem.id && qty == cartItem.qty && Objects.equals(productID, cartItem.productID) && Objects.equals(itemName, cartItem.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productID, itemName, qty);
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", productID='" + productID + '\'' +
                ", itemName='" + itemName + '\'' +
                ", qty=" + qty +
                '}';
    }
}
