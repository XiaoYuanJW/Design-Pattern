package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        observers.stream()
                .forEach(Observer::update);
    }
}
