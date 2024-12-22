package com.api.core.domain.service;

import com.api.core.aplication.port.out.CustomerRepository;
import com.api.core.domain.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public int registerCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findCustomerById(String id) {
        return customerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Customer not found with ID: " + id));
    }
}