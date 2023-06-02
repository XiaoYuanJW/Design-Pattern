import enums.ShapeEnum;
import factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory.getShape(ShapeEnum.Square).draw();
        ShapeFactory.getShape(ShapeEnum.Circle).draw();
        ShapeFactory.getShape(ShapeEnum.Rectangle).draw();

        ShapeFactory.getShape(ShapeEnum.Square).draw();
    }
}