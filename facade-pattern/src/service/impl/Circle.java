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
    public void draw() {
        System.out.println("Draw Circle");
    }
}
