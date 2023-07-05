package com.harsha.ecommerce.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Promotion {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String name; 
    private double discountPercentage; 
    private LocalDate startDate; 
    private LocalDate endDate; 
    @ManyToMany
    @JoinTable(name = "promotion_product",
                joinColumns = @JoinColumn(name = "promotion_id"),
                inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> applicableProducts;
}
