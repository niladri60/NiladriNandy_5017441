import productSearchDocs.BinarySearch_Product;
import productSearchDocs.LinearSearch_Product;
import productSearchDocs.Product;

public class Ecommerce_Platform_Search_Function_Test {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P101", "Camera", "Electronics"),
                new Product("P102", "Tripod", "Accessories"),
                new Product("P103", "Drone", "Electronics"),
                new Product("P104", "Lens", "Accessories"),
                new Product("P105", "Lighting Kit", "Photography")
        };

        // Linear Search
        System.out.println("Linear Search by ID: " + LinearSearch_Product.linearSearchById(products, "P103"));
        System.out.println("Linear Search by Name: " + LinearSearch_Product.linearSearchByName(products, "Lens"));
        System.out.println("Linear Search by Category: " + LinearSearch_Product.linearSearchByCategory(products, "Photography"));

        // Binary Search
        System.out.println("Binary Search by ID: " + BinarySearch_Product.binarySearchById(products, "P103"));
        System.out.println("Binary Search by Name: " + BinarySearch_Product.binarySearchByName(products, "Lens"));
        System.out.println("Binary Search by Category: " + BinarySearch_Product.binarySearchByCategory(products, "Photography"));
    }
}
