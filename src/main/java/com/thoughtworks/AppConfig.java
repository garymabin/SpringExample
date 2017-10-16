package com.thoughtworks;

import com.thoughtworks.repository.CustomerRepository;
import com.thoughtworks.repository.HibernateCustomerRepositoryImpl;
import com.thoughtworks.service.CustomerService;
import com.thoughtworks.service.CustomerServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.thoughtworks")
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
        CustomerServiceImpl customerService =  new CustomerServiceImpl();
        return customerService;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }
}
