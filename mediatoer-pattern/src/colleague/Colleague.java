package colleague;

import mediator.Mediator;

/**
 * Colleague
 *
 * @author YuanJW
 * @date 2023/06/04
 */
public abstract class Colleague {
    public abstract void onEvent(Mediator mediator);
}
