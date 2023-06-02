package utils;

import domain.Shape;
import enums.ShapeEnum;

import java.util.Hashtable;

/**
 * ShapeCache
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class ShapeCache {

    private static Hashtable<ShapeEnum, Shape> cache = new Hashtable<>(ShapeEnum.values().length);

    static {
        for (ShapeEnum type : ShapeEnum.values()) {
            cache.put(type, type.createShape());
        }
    }

    public static Shape getShape(ShapeEnum shapeEnum) {
        Shape shape = cache.get(shapeEnum);
        return (Shape) shape.clone();
    }
}
