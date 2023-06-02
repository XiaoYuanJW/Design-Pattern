package service;

/**
 * ProxyShape
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class ProxyShape implements Shape {

    private RealShape realShape;

    private String shape;

    public ProxyShape(String shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        if (realShape == null) {
            realShape = new RealShape(shape);
        }
        realShape.draw();
    }
}
