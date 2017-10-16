package com.thoughtworks.repository;

import com.thoughtworks.entity.Customer;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
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
