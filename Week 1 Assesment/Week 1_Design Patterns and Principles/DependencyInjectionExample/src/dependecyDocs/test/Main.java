package dependecyDocs.test;

import dependecyDocs.customer.Customer;
import dependecyDocs.customer.CustomerRepository;
import dependecyDocs.customer.CustomerRepositoryImpl;
import dependecyDocs.service.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        CustomerService customerService = new CustomerService(customerRepository);

        Customer customer = customerService.getCustomerById(1);
        System.out.println("Customer Name: "+customer.name());
    }
}
