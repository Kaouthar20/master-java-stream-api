package com.example.masterjavastreamapi.repositories;

import com.example.masterjavastreamapi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
