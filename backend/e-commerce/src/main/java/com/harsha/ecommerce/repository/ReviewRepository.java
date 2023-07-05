package com.harsha.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsha.ecommerce.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    
}
