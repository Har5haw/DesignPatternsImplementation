package MVC.Model;

public class Student {
    private String firstname;
    private String lastname;
    private double totalMarks;

    public Student(String firstname, String lastname, double totalMarks) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalMarks = totalMarks;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }
}
