package com.graphql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCT")
@Data
@NoArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Float quantity;
    private String category;
    private Float price;

    public ProductEntity(String name, Float quantity, String category, Float price) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
    }
}
