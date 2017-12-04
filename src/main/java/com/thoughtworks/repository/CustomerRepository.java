package com.thoughtworks.repository;

import com.thoughtworks.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    Customer save(Customer c);

    Customer findCustomerByFirstName(String firstName);
}
