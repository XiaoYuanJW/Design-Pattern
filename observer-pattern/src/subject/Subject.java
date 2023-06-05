package subject;

import observer.Observer;

/**
 * Subject
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public interface Subject {

    int getNumber();

    void setNumber(int number);

    void registerObserver(Observer observer);

    void notifyObservers();
}
