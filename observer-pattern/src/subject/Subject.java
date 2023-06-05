package subject;

import observer.Observer;

/**
 * Subject 【主题】
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public interface Subject {

    int getNumber();

    void setNumber(int number);

    /**
     * 添加观察者
     *
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
