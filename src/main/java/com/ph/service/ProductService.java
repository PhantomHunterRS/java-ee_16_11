package com.ph.service;

import com.ph.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private final List<Product> productList = new ArrayList<>();
    {
        productList.add(new Product(1l,"Apple",79));
        productList.add(new Product(2l,"Banana",65));
        productList.add(new Product(3l,"Milk",64));
        productList.add(new Product(4l,"Grapefruits",129));
        productList.add(new Product(5l,"Orange",99));
        productList.add(new Product(6l,"Butter",130));
        productList.add(new Product(7l,"Cucumber",172));
        productList.add(new Product(8l,"Tomato",225));
        productList.add(new Product(9l,"Meat",679));
        productList.add(new Product(10l,"Bread",52));
    }
    public void createProduct(Product product){
        productList.add(product);
    }

}
