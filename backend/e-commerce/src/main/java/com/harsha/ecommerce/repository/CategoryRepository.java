package com.harsha.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsha.ecommerce.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
