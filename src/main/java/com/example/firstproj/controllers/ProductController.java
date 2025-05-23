package com.example.firstproj.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.firstproj.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.firstproj.dataclass.Product;
import java.util.List;

@RestController

public class ProductController {

    @Autowired
    ProductService ps;

    @GetMapping("/products")
    public List<Product> getproducts() {
        return ps.getProducts();
    }

}
