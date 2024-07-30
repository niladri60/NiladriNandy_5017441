import employeeDocs.Employee;
import employeeDocs.EmployeeManager;

public class Employee_Management_System_Test {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        // Adding employees
        manager.addEmployee(new Employee("E101", "John", "Software Engineer", 90000));
        manager.addEmployee(new Employee("E102", "Emma", "Product Designer", 70000));
        manager.addEmployee(new Employee("E103", "Noah", "Project Manager", 95000));

        // Traversing employees
        System.out.println("All Employees:");
        manager.traverseEmployees();

        // Searching for an employee
        System.out.println("\nSearching for employee with ID E102:");
        Employee employee = manager.searchEmployeeById("E102");
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        // Deleting an employee
        System.out.println("\nDeleting employee with ID E102:");
        boolean deleted = manager.deleteEmployeeById("E102");
        if (deleted) {
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }

        // Traversing employees after deletion
        System.out.println("\nAll Employees after deletion:");
        manager.traverseEmployees();
    }
}
