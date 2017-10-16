package com.thoughtworks.repository;

import com.thoughtworks.entity.Customer;

import java.util.Collections;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements HibernateCustomerRepository {
    @Override
    public List<Customer> findAll() {
//        List<Customer> customers = new ArrayList<>();
//        Customer customer = new Customer();
//        customer.setFirstName("Gary");
//        customer.setLastName("Ma");
//        customers.add(customer);
//
//        return customers;

        return Collections.singletonList(Customer.builder()
            .firstName("Gary")
            .lastName("Ma")
            .build());
    }
}
