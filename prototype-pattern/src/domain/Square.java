package domain;

import enums.ShapeEnum;

/**
 * Square
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class Square extends Shape {

    public Square() {
        this.type = ShapeEnum.Square;
    }

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
