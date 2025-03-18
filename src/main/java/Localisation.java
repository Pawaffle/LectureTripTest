import java.util.Locale;
import java.util.ResourceBundle;

public class Localisation {
    public static void main(String[] args) {
        Locale locale = new Locale("ru", "RU");
        ResourceBundle rb = ResourceBundle.getBundle("myBundle", locale);
        String greet = rb.getString("greeting");
        System.out.println(greet);
    }
}
