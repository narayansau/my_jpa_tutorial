package com.example.jpatutorial.my_jpa_tutorial.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends
        JpaRepository<Product , Long>{
}
