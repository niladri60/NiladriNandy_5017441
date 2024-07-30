import customerOrderDocs.BubbleSort_Orders;
import customerOrderDocs.Order;
import customerOrderDocs.QuickSort_Orders;

public class Sorting_Customer_Orders_Test {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O101", "Niladri", 450.00),
                new Order("O102", "Priyanshu", 320.75),
                new Order("O103", "Sohan", 150.30),
                new Order("O104", "Subhodeep", 560.20)
        };

        System.out.println("Original Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Bubble Sort
        BubbleSort_Orders.bubbleSortByTotalPrice(orders);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reinitialize orders
        orders = new Order[] {
                new Order("O101", "Niladri", 450.00),
                new Order("O102", "Priyanshu", 320.75),
                new Order("O103", "Sohan", 150.30),
                new Order("O104", "Subhodeep", 560.20)
        };

        // Quick Sort
        QuickSort_Orders.quickSortByTotalPrice(orders, 0, orders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
