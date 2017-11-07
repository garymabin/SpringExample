package com.thoughtworks.repository;

import com.thoughtworks.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HibernateJpaCustomerRepositoryImpl extends CustomerRepository, JpaRepository<Customer, Long> {
}
