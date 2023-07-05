package com.harsha.ecommerce.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Review {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID; 
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; 
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product; 
    private double rating; 
    private String comment; 
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime timestamp;
}
