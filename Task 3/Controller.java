public class Controller {

    Model model = new Model();

    
    private View view;

   
    public String showSummary() {
        String data = model.getStudentSummary();
        return view.render(data);
    }
}