package domain;

import enums.ShapeEnum;

/**
 * Circle
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class Circle extends Shape {

    public Circle() {
        this.type = ShapeEnum.Circle;
    }

    @Override
    public void draw() {
        System.out.println("Draw Cricle");
    }
}
