package factory;

import enums.ShapeEnum;
import service.Shape;

/**
 * ShapeFactory
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class ShapeFactory {
    public static Shape getShape(ShapeEnum shape) {
        return shape.createShape();
    }
}
