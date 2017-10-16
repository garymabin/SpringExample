package com.thoughtworks.repository;

import com.thoughtworks.entity.Customer;

import java.util.List;

public interface HibernateCustomerRepository {
    List<Customer> findAll();
}
