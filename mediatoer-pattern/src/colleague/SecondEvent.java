package colleague;

import mediator.Mediator;

/**
 * SecondEvent
 *
 * @author YuanJW
 * @date 2023/06/04
 */
public class SecondEvent extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("Second");
    }

    public void doEvent() {
        System.out.println("Second");
    }
}
