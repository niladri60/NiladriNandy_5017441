package mvcDocs;

import mvcDocs.controller.StudentController;
import mvcDocs.model.Student;
import mvcDocs.view.StudentView;

public class MVCPatternDemo {
    public static void main(String[] args) {
        System.out.println("=======================================");
        // Creating a student object (Model)

        Student model = new Student("01", "Niladri Nandy", "A");

        // Creating a view to display student details (View)
        StudentView view = new StudentView();

        // Creating a controller to manage the model and view
        StudentController controller = new StudentController(model, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("A+");

        // Display updated student details
        controller.updateView();
        System.out.println("=======================================");
    }
}
