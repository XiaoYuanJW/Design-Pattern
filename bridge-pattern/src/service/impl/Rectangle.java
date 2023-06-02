package service.impl;

import service.Shape;

/**
 * Rectangle
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class Rectangle implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("Draw Rectangle locate at (%d, %d)", x, y));
    }
}
