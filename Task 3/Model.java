public class Model {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getSummary() {
        return "Student Summary:\n" +
               "Name: " + name + "\n" +
               "Age: " + age + "\n" +
               "GPA: " + gpa;
    }
}