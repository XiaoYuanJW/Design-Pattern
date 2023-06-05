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
    // 使用一个ArrayList存放观察者
    private List<Observer> observers = new ArrayList<>();

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.stream()
                .forEach(Observer::update);
    }
}
