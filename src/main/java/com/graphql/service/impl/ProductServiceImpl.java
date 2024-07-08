package com.graphql.service.impl;

import com.graphql.entity.ProductEntity;
import com.graphql.repository.ProductRepository;
import com.graphql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductEntity> fetchAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<ProductEntity> fetchByCategory(String category) {
        return productRepository.findByCategory(category);
    }
}
