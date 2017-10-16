package com.thoughtworks.service;

import com.thoughtworks.entity.Customer;
import com.thoughtworks.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
