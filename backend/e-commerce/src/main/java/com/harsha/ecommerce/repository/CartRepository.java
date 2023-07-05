package com.harsha.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsha.ecommerce.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
    
}
