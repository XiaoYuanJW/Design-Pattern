package originator;

import menento.Menento;

/**
 * Originator   【初始对象：创建并在Memento对象中存储状态】
 *
 * @author YuanJW
 * @date 2023/06/04
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Menento createMenento() {
        return new Menento(state);
    }

    public void restoreMenento(Menento menento) {
        state = menento.getState();
    }
}
