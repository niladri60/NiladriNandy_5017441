package com.example.test;

import com.example.customer.Customer;
import com.example.customer.CustomerRepository;
import com.example.customer.CustomerRepositoryImpl;
import com.example.service.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        CustomerService customerService = new CustomerService(customerRepository);

        Customer customer = customerService.getCustomerById(1);
        System.out.println("Customer Name: "+customer.name());
    }
}
