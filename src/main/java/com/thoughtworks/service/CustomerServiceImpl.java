package com.thoughtworks.service;

import com.thoughtworks.entity.Customer;
import com.thoughtworks.repository.CustomerRepository;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Setter(onMethod = @__(@Autowired))
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
