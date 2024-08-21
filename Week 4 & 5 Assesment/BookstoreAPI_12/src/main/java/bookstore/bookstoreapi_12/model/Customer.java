package bookstore.bookstoreapi_12.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Customer {
    public Long id;
    @Setter
    @NotNull
    @Size(min = 1, max = 255)
    private String name;

    @Setter
    @NotNull
    @Email
    private String email;

    @Setter
    @NotNull
    @Size(min = 1, max = 255)
    private String address;

    // Constructor, getters, and setters

    public Customer() {}

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

}
