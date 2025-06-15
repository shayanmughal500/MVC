@Service
public class View {
    public String render(String data) {
        return "<html><body><h2>" + data + "</h2></body></html>";
    }
}