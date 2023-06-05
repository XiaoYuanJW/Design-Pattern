import controller.Controller;
import model.Model;
import view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.updateView();

        // 设置数据
        controller.setModelData("Hello world");
        // 更新视图
        controller.updateView();
    }
}