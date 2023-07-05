package com.harsha.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsha.ecommerce.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    
}
