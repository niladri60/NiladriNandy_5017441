import taskDocs.Task;
import taskDocs.TaskLinkedList;

public class Task_Management_System_Test {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task("T101", "Gather Requirements", "In Progress"));
        taskList.addTask(new Task("T102", "Implement User Interface", "Pending"));
        taskList.addTask(new Task("T103", "Conduct Code Review", "Completed"));

        // Traversing tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Searching for a task
        System.out.println("\nSearching for task with ID T102:");
        Task task = taskList.searchTaskById("T102");
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        // Deleting a task
        System.out.println("\nDeleting task with ID T102:");
        boolean deleted = taskList.deleteTaskById("T102");
        if (deleted) {
            System.out.println("Task deleted.");
        } else {
            System.out.println("Task not found.");
        }

        // Traversing tasks after deletion
        System.out.println("\nAll Tasks after deletion:");
        taskList.traverseTasks();
    }
}
