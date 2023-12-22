package com.example.demo.customer;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

// Later for use to connect to a real db
@Component
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        // TODO: Connect to real db
        return Collections.emptyList();
    }
}
