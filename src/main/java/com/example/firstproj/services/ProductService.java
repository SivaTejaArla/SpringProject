package com.example.firstproj.services;

import java.util.Arrays;
import com.example.firstproj.dataclass.Product;

import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class ProductService {

    List<Product> lis =  Arrays.asList(new Product(1,"Shirt", 450), new Product(2,"Track Pant", 490),new Product(3,"Shoe", 850),new Product(4,"Belt", 150) ) ; 

    public List<Product> getProducts() {
        return lis;
    }

}
