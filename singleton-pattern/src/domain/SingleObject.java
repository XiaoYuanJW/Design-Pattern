package domain;

/**
 * SingleObject
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class SingleObject {

    // 创建 SingleObject 一个对象
    private static SingleObject instance = new SingleObject();

    /**
     * 构造函数实例化 防止类被实例化
     */
    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
