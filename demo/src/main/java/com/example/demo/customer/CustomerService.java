package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Creates a bean (single instance)
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }
    List<Customer> getCustomers() {
        // Now you can use customerRepo to get customers
        return customerRepo.getCustomers();
    }

    Customer getCustomer(Long id) {
        return getCustomers()
                .stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format("Customer with %d not found ", id)));
    }
}
