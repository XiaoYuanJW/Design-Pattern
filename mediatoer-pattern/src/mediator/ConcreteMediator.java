package mediator;

import colleague.FirstEvent;
import colleague.SecondEvent;

/**
 * ConcreteMediator
 *
 * @author YuanJW
 * @date 2023/06/04
 */
public class ConcreteMediator extends Mediator {

    private FirstEvent firstEvent;

    private SecondEvent secondEvent;

    public ConcreteMediator(FirstEvent firstEvent, SecondEvent secondEvent) {
        this.firstEvent = firstEvent;
        this.secondEvent = secondEvent;
    }


    @Override
    public void doEvent(String event) {
        switch (event) {
            case "First" :
                firstEvent.doEvent();
                break;
            case "Second" :
                secondEvent.doEvent();
                break;
        }
    }
}
