package bookstore.bookstoreapi_8.model;

import jakarta.persistence.Version;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long id;

    @NotNull
    @Size(min = 1, max = 255)
    private String title;

    @NotNull
    @Size(min = 1, max = 255)
    private String author;

    @NotNull
    @Min(value = 0)
    private Double price;

    @NotNull
    @Size(min = 10, max = 13)
    private String isbn;

    @Version
    private int version;
}
