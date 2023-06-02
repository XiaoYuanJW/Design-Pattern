import domain.Shape;
import utils.ShapeCache;

import static enums.ShapeEnum.*;

public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeCache.getShape(Rectangle);
        System.out.println("Shape : " + shape.getType());
        shape.draw();
    }
}