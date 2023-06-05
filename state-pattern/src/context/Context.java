package context;

import state.StartState;
import state.State;

/**
 * Context  【包含 状态 的对象】
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class Context {

    private State state;

    public Context() {
        // 初始化默认状态
        state = new StartState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
