package service.impl;

import service.Shape;

/**
 * Circle
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class Circle implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("Draw Circle locate at (%d, %d)", x, y));
    }
}
