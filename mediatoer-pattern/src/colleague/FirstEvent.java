package colleague;

import mediator.Mediator;

/**
 * FirstEvent
 *
 * @author YuanJW
 * @date 2023/06/04
 */
public class FirstEvent extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("First");
    }

    public void doEvent() {
        System.out.println("First");
    }
}
