package com.thoughtworks;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.thoughtworks")
public class AppConfig {
//
//    @Bean(name = "customerService")
//    public CustomerService getCustomerService() {
//        CustomerServiceImpl customerService =  new CustomerServiceImpl();
//        return customerService;
//    }
//
//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
}
