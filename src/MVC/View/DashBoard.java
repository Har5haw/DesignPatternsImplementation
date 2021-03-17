package MVC.View;

import MVC.Model.Student;

public class DashBoard {
    public void printDashBoard(Student student){
        System.out.println("FirstName: "+student.getFirstname());
        System.out.println("LastName: "+student.getLastname());
        System.out.println("TotalMarks: "+student.getTotalMarks());
    }
}
