package dependecyDocs.customer;

public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public Customer findCustomerById(int id) {
        // Dummy implementation for demonstration
        return new Customer(id, "Niladri Nandy");
    }
}
