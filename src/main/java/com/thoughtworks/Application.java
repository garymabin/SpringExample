package com.thoughtworks;

import com.thoughtworks.repository.CustomerRepository;
import com.thoughtworks.service.CustomerService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);

        System.out.println(customerService.findAll().get(0).getFirstName());

        CustomerRepository customerRepository = applicationContext.getBean("customerRepository", CustomerRepository.class);


        System.out.println(customerRepository.findCustomerByFirstName("Bob"));
    }
}
