package state;

import context.Context;

/**
 * StartState
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Current State Is Start State!");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
