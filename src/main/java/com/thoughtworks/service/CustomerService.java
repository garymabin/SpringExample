package com.thoughtworks.service;

import com.thoughtworks.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer saveCustomer(Customer customer);
}
