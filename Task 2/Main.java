public class Main {
    public static void main(String[] args) {
        // Create the MVC components
        Model model = new Model();
        View view = new View();
        SummaryModel summaryModel = new SummaryModel();
        Controller controller = new Controller(model, view, summaryModel);

        // Create a student
        Student student = new Student("Shayan", 21, 3.9);

        // Set and display student info
        controller.setStudent(student);
        controller.updateView();
    }
}