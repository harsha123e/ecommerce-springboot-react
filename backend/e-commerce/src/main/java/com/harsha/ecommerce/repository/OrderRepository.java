package com.harsha.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsha.ecommerce.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
