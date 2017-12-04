package com.thoughtworks.repository;

import com.thoughtworks.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public interface HibernateJpaCustomerRepositoryImpl extends CustomerRepository, JpaRepository<Customer, Long> {

    Customer findByFirstName(String firstName);

    @Override
    default Customer findCustomerByFirstName(String firstName) {
        return this.findByFirstName(firstName);
    }
}
