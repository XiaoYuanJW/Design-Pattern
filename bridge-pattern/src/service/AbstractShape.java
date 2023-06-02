package service;

/**
 * AbstractShape
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public abstract class AbstractShape {
    protected Shape shape;

    protected AbstractShape(Shape shape) {
        this.shape = shape;
    }

    public abstract void draw();
}
