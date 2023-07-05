package com.harsha.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Category {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID; 
    private String name;
    @ManyToOne
    @JoinColumn(name = "parent_category_id")
    private Category parentCategory;
}
