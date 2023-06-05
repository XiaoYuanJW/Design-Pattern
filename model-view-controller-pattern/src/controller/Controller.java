package controller;

import model.Model;
import view.View;

/**
 * Controller   【控制器-控制器作用于 模型 和 视图 上。它控制数据流向模型对象，并在数据变化时更新视图。它使 视图 与 模型 分离开】
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class Controller {

    private Model model;

    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setModelData(String data) {
        model.setData(data);
    }

    public void updateView() {
        view.display(model.getData());
    }
}
