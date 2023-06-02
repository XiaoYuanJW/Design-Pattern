package service;

import enums.ShapeEnum;

/**
 * ShapeDraw
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class ShapeDraw implements Shape {
    private ShapeEnum type;

    public ShapeDraw(ShapeEnum type) {
        this.type = type;
    }

    @Override
    public void draw() {
        System.out.println("ShapeDraw " + type.toString());
    }
}
