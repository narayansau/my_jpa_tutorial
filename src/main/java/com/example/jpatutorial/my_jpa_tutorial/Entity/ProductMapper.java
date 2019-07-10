package com.example.jpatutorial.my_jpa_tutorial.Entity;


import java.util.List;

public interface ProductMapper {
    ProductDTO toProductDTO ( Product product);

    List<ProductDTO> toProductDTOs ( List<Product> products);
    Product toProduct ( ProductDTO productDTO);
}
