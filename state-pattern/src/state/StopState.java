package state;

import context.Context;

/**
 * StopState
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Current State Is Start State!");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
