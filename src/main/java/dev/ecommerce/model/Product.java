package dev.ecommerce.model;

import java.util.Objects;

public class Product {
    long id;
    String sku;
    String name;
    String categories;
    Double price;

    public Product(){}



    public Product(long id, String sku, String name, String categories, Double price){
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.categories = categories;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", categories='" + categories + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(sku, product.sku) && Objects.equals(name, product.name) && Objects.equals(categories, product.categories) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, name, categories, price);
    }
}


