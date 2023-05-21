package com.example.masterjavastreamapi.repositories;

import com.example.masterjavastreamapi.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
