package com.example.jpatutorial.my_jpa_tutorial.Entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDTO {
    private String name;
    private String description;
    private BigDecimal price;
}
