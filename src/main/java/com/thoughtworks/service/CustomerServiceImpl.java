package com.thoughtworks.service;

import com.thoughtworks.entity.Customer;
import com.thoughtworks.repository.CustomerRepository;

import lombok.Setter;

import java.util.List;

@Setter
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
