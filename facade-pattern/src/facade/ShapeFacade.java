package facade;

import service.Shape;
import service.impl.Circle;
import service.impl.Rectangle;
import service.impl.Square;

/**
 * ShapeFacade
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class ShapeFacade {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void draw() {
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
