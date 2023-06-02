package factory;

import enums.ShapeEnum;
import service.ShapeDraw;
import service.Shape;

import java.util.HashMap;

/**
 * ShapeFactory
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class ShapeFactory {
    private static final HashMap<ShapeEnum, Shape> map =
            new HashMap<>();

    public static Shape getShape(ShapeEnum type) {
        ShapeDraw shapeDraw = (ShapeDraw) map.get(type);
        if (shapeDraw == null) {
            shapeDraw = new ShapeDraw(type);
            map.put(type, shapeDraw);
            System.out.println("Creaing shape：" + type.toString());
        }
        return shapeDraw;
    }
}
