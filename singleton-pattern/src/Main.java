import domain.SingleObject;

public class Main {
    public static void main(String[] args) {

        // 获取唯一实例对象
        SingleObject instance = SingleObject.getInstance();
        // 执行实例方法
        instance.showMessage();

//        SingleObject.getInstance().showMessage();
    }
}