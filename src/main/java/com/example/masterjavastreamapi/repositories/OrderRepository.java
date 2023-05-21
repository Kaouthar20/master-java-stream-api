package com.example.masterjavastreamapi.repositories;

import com.example.masterjavastreamapi.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
