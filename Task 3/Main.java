public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.setStudent("Shayan", 21, 3.9);
        controller.updateView();
    }
}