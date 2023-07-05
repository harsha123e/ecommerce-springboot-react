package com.harsha.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsha.ecommerce.model.Promotion;

public interface PromotionRepository extends JpaRepository<Promotion, Long> {
    
}
