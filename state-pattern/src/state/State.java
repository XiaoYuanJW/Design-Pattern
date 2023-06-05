package state;

import context.Context;

/**
 * State    【状态】
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public interface State {
    void doAction(Context context);
}
