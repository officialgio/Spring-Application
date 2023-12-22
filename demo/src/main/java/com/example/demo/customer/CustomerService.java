package com.example.demo.customer;

import org.springframework.stereotype.Component;

import java.util.List;

@Component // Creates a bean (single instance)
public class CustomerService {
    private final CustomerRepo customerRepo;
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }
    List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }

}
