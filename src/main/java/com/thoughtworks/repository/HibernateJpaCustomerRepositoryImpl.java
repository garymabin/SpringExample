package com.thoughtworks.repository;

import com.thoughtworks.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public interface HibernateJpaCustomerRepositoryImpl extends CustomerRepository, JpaRepository<Customer, Long> {

    Customer findByFirstName(String firstName);

    @Query("select c from Customer c where c.firstName = :firstName")
    Customer findByFirstNameJPQL(@Param("firstName") String firstName);

    @Override
    default Customer findCustomerByFirstName(String firstName) {
        return this.findByFirstNameJPQL(firstName);
    }
}
