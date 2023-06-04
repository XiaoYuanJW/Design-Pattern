import colleague.FirstEvent;
import colleague.SecondEvent;
import mediator.ConcreteMediator;

public class Main {
    public static void main(String[] args) {

        FirstEvent firstEvent = new FirstEvent();
        SecondEvent secondEvent = new SecondEvent();

        ConcreteMediator concreteMediator = new ConcreteMediator(firstEvent, secondEvent);

        firstEvent.onEvent(concreteMediator);
    }
}