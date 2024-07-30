import inventoryDocs.Inventory;
import inventoryDocs.Product;

public class Inventory_Management_Test {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
        Product product3 = new Product("P003", "Tablet", 15, 299.99);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.displayAllProducts();
        // Update a product
        Product updatedProduct1 = new Product("P001", "Laptop", 12, 979.99);
        inventory.updateProduct(updatedProduct1);
        // Delete a product
        inventory.deleteProduct("P002");
        inventory.displayAllProducts();
    }
}
