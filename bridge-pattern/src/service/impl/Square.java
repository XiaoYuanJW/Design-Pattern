package service.impl;

import service.Shape;

/**
 * Square
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class Square implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("Draw Square locate at (%d, %d)", x, y));
    }
}
