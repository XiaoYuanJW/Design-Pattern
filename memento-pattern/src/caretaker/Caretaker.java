package caretaker;

import menento.Menento;

/**
 * Caretaker    【负责人】
 *
 * @author YuanJW
 * @date 2023/06/04
 */
public class Caretaker {

    private Menento menento;

    public Menento getMenento() {
        return menento;
    }

    public void setMenento(Menento menento) {
        this.menento = menento;
    }
}
