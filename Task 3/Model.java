
public class Model {
    public String getStudentSummary() {
        String name = "Shayan";
        int age = 21;
        double gpa = 3.9;

        return "Student Summary:<br>" +
               "Name: " + name + "<br>" +
               "Age: " + age + "<br>" +
               "GPA: " + gpa;
    }
}