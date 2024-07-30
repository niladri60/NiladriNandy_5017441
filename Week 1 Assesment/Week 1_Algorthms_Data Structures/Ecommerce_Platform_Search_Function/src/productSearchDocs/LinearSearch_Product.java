package productSearchDocs;

import productSearchDocs.Product;

public class LinearSearch_Product {
    public static Product linearSearchById(Product[] Product, String ProductId) {
        for (Product prod : Product) {
            if (prod.getProductId().equals(ProductId)) {
                return prod;
            }
        }
        return null;
    }

    public static Product linearSearchByName(Product[] Product, String ProductuctName) {
        for (Product prod : Product) {
            if (prod.getProductName().equals(ProductuctName)) {
                return prod;
            }
        }
        return null;
    }

    public static Product linearSearchByCategory(Product[] Product, String category) {
        for (Product prod : Product) {
            if (prod.getCategory().equals(category)) {
                return prod;
            }
        }
        return null;
    }
}
