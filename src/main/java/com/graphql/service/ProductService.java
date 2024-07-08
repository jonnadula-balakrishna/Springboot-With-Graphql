package com.graphql.service;

import com.graphql.entity.ProductEntity;
import com.graphql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ProductService {

    public List<ProductEntity> fetchAllProducts();

    public List<ProductEntity> fetchByCategory(String category);

}
