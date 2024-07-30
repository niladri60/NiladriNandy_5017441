import libraryDocs.Book;
import libraryDocs.BookSearch;

public class Library_Management_System_Test {
    public static void main(String[] args) {
        Book[] books = {
                new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
                new Book("B002", "1984", "George Orwell"),
                new Book("B003", "To Kill a Mockingbird", "Harper Lee")
        };

        // Linear Search
        System.out.println("Linear Search:");
        Book book = BookSearch.linearSearchByTitle(books, "1984");
        if (book != null) {
            System.out.println("Found: " + book);
        } else {
            System.out.println("Book not found.");
        }

        // Binary Search (assuming books are sorted by title)
        System.out.println("\nBinary Search:");
        Book[] sortedBooks = {
                new Book("B002", "1984", "George Orwell"),
                new Book("B003", "To Kill a Mockingbird", "Harper Lee"),
                new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald")
        };
        book = BookSearch.binarySearchByTitle(sortedBooks, "To Kill a Mockingbird");
        if (book != null) {
            System.out.println("Found: " + book);
        } else {
            System.out.println("Book not found.");
        }
    }
}
