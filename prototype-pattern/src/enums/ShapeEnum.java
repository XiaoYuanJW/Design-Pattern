package enums;

import domain.Circle;
import domain.Rectangle;
import domain.Shape;
import domain.Square;

/**
 * ShapeEnum   shape枚举
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public enum ShapeEnum {
    Rectangle {
        @Override
        public Shape createShape() {
            return new Rectangle();
        }
    },
    Square {
        @Override
        public Shape createShape() {
            return new Square();
        }
    },
    Circle {
        @Override
        public Shape createShape() {
            return new Circle();
        }
    };

    public abstract Shape createShape();
}
