package bookstore.bookstoreapi_7.model;

public class Customer {
    private Long id;
    private String name;
    private String email;
    private String address;
    // Constructor, getters, and setters

    public Customer() {}

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
