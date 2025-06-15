public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setStudent(String name, int age, double gpa) {
        Student student = new Student(name, age, gpa);
        model.setStudent(student);
    }

    public void updateView() {
        Student student = model.getStudent();
        String summary = student.getSummary();
        view.showSummary(summary);
    }
}