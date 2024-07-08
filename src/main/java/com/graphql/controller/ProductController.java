package com.graphql.controller;

import com.graphql.entity.ProductEntity;
import com.graphql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @QueryMapping
    public List<ProductEntity> getAllProducts() {
        return productService.fetchAllProducts();
    }

    @QueryMapping
    public List<ProductEntity> getAllProductsByCategory(@Argument String category) {
        return productService.fetchByCategory(category);
    }
}
