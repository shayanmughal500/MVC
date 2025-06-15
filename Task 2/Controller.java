public class Controller {
    private Model model;
    private View view;
    private SummaryModel summaryModel;

    public Controller(Model model, View view, SummaryModel summaryModel) {
        this.model = model;
        this.view = view;
        this.summaryModel = summaryModel;
    }

    public void setStudent(Student student) {
        model.setStudent(student);
    }

    public void updateView() {
        Student student = model.getStudent();
        String summary = summaryModel.generateSummary(student);
        view.printSummary(summary);
    }
}