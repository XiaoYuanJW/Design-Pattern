package service;

/**
 * ShapeDraw
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class ShapeDraw extends AbstractShape {
    private int x, y;

    public ShapeDraw(int x, int y, Shape shape) {
        super(shape);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        shape.draw(x, y);
    }
}
