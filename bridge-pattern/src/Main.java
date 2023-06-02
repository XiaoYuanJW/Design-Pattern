import service.ShapeDraw;
import service.impl.Rectangle;

public class Main {
    public static void main(String[] args) {
        ShapeDraw rectangle = new ShapeDraw(10, 10, new Rectangle());
        rectangle.draw();
    }
}