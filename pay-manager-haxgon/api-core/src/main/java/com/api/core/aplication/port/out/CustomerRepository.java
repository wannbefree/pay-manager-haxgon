package com.api.core.aplication.port.out;

import com.api.core.domain.model.Customer;

import java.util.Optional;

public interface CustomerRepository {
    int save(Customer customer);
    Optional<Customer> findById(String id);
}