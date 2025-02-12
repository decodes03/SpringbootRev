package com.revision.APIs.Controller;

import com.revision.APIs.Model.Product;
import com.revision.APIs.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/allProducts")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

}
