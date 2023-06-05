import template.FirstTemplate;
import template.SecondTemplate;
import template.Template;

public class Main {
    public static void main(String[] args) {

        Template template = new FirstTemplate();
        template.templateMethod();

        template = new SecondTemplate();
        template.templateMethod();
    }
}