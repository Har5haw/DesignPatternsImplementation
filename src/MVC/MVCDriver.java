package MVC;

import MVC.Controller.StudentController;
import MVC.Model.Student;
import MVC.View.DashBoard;

public class MVCDriver {
    public static void main(String[] args) {
        Student student = new Student("Harsha", "Vardhan", 1000);
        DashBoard dashBoard = new DashBoard();
        StudentController studentController = new StudentController(student, dashBoard);
        studentController.print();
        studentController.setName("Vardhan", "Harsha");
        studentController.print();
    }
}
