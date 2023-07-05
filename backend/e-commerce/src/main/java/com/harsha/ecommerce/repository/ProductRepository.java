package com.harsha.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsha.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
