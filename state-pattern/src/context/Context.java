package context;

import state.State;

/**
 * Context
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class Context {
    private State state;

    public Context() {
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
