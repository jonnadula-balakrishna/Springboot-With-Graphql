package com.graphql;

import com.graphql.entity.ProductEntity;
import com.graphql.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class GraphqlUsingSpringBootApplication {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlUsingSpringBootApplication.class, args);
	}
//	@PostConstruct
	private void saveProducts(){
		// Create initial products using streams
		List<ProductEntity> products = Arrays.asList(
				new ProductEntity("Product 1", 100f, "Category 1", 10.5F),
				new ProductEntity("Product 2", 200f, "Category 2", 20.0F),
				new ProductEntity("Product 3", 150f, "Category 3", 15.75F),
				new ProductEntity("Product 4", 120f, "Category 1", 12.0F),
				new ProductEntity("Product 5", 180f, "Category 2", 18.5F)
		);

		productRepository.saveAll(products);

	}

}
