package MVC.Controller;

import MVC.Model.Student;
import MVC.View.DashBoard;

public class StudentController {
    private Student student;
    private DashBoard dashBoard;

    public StudentController(Student student, DashBoard dashBoard) {
        this.student = student;
        this.dashBoard = dashBoard;
    }

    public void setName(String firstName, String lastName){
        student.setFirstname(firstName);
        student.setLastname(lastName);
    }

    public void print(){
        dashBoard.printDashBoard(student);
    }
}
