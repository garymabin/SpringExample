package com.thoughtworks;

import com.thoughtworks.entity.Address;
import com.thoughtworks.entity.Customer;
import com.thoughtworks.service.CustomerService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);

        Customer c = Customer.builder()
            .firstName("Alice")
            .lastName("Jane")
            .build();
        c.setAddresses(Arrays.asList(
            Address.builder()
                .addr1("USA")
                .customer(c)
                .build(),
            Address.builder()
                .addr1("China")
                .customer(c)
                .build(),
            Address.builder()
                .addr1("Japan")
                .customer(c)
                .build()));

        customerService.saveCustomer(c);
    }
}
