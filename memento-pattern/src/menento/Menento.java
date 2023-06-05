package menento;

/**
 * Menento  【备忘录：被恢复的对象的状态】
 *
 * @author YuanJW
 * @date 2023/06/04
 */
public class Menento {

    private String state;

    public Menento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
