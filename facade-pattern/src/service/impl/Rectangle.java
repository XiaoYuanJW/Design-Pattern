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
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
