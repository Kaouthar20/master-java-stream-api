package com.example.masterjavastreamapi.repositories;

import com.example.masterjavastreamapi.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
