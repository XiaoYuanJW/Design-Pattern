import enums.ShapeEnum;
import factory.ShapeFactory;
import service.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeEnum.Rectangle);
        shape.draw();
    }
}