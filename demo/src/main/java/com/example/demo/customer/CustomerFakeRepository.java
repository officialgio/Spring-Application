package com.example.demo.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

//@Repository(value = "fake") not use due to pre-setup in Configurations
public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Giovanny Hernandez", "emial@gmail.com", "password123"),
                new Customer(2L, "Faizaan Ahmed", "emial@gmail.com","123password")
        );
    }
}

