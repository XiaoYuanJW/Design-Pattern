package domain;

import enums.ShapeEnum;

/**
 * Rectangle
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class Rectangle extends Shape {

    public Rectangle() {
        this.type = ShapeEnum.Rectangle;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
