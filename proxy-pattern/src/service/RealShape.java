package service;

/**
 * RealShape
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class RealShape implements Shape {

    private String shape;

    public RealShape(String shape) {
        this.shape = shape;
        System.out.println("Loading RealShape");
    }

    @Override
    public void draw() {
        System.out.println("Draw RealShape：" + shape);
    }
}
