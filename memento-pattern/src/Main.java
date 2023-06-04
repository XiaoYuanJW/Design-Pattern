import caretaker.Caretaker;
import menento.Menento;
import originator.Originator;

public class Main {
    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator();
        // 设置 原发对象 状态
        originator.setState("State #1");

        // 创建备忘录并保存当前状态
        Menento menento = originator.createMenento();
        caretaker.setMenento(menento);

        // 修改 原发对象 状态
        originator.setState("State #2");
        System.out.println("Current State: " + originator.getState());

        // 从 备忘录 中 恢复原始状态
        originator.restoreMenento(caretaker.getMenento());
        System.out.println("Restore State：" + originator.getState());
    }
}