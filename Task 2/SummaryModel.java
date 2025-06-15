public class SummaryModel {
    public String generateSummary(Student student) {
        return "Student Summary:\n"
                + "Name: " + student.getName() + "\n"
                + "Age: " + student.getAge() + "\n"
                + "GPA: " + student.getGpa();
    }
}