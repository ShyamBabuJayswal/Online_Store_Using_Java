package com.project.nine_zero_nine.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.nine_zero_nine.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
 
}
