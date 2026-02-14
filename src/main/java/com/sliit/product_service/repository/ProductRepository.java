package com.sliit.product_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sliit.product_service.models.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
    
}
