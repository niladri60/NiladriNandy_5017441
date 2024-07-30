package com.example.mvc;

import com.example.mvc.controller.StudentController;
import com.example.mvc.model.Student;
import com.example.mvc.view.StudentView;

public class MVCPatternDemo {
    public static void main(String[] args) {
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
    }
}
