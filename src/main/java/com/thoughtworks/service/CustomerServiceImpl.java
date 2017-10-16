package com.thoughtworks.service;

import com.thoughtworks.entity.Customer;
import com.thoughtworks.repository.CustomerRepository;
import com.thoughtworks.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
