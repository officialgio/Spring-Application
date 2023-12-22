package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // Creates a bean (single instance)
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(@Qualifier("fake") CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }
    List<Customer> getCustomer() {
        // Now you can use customerRepo to get customers
        return customerRepo.getCustomers();
    }
}
