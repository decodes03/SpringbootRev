package com.revision.APIs.Service;

import com.revision.APIs.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101, "IPhone", 80000),
            new Product(102, "MacBook", 150000),
            new Product(103, "IPad", 100000));

    public List<Product> getProducts(){
        return products;
    }
}
