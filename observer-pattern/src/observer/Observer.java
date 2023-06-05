package observer;

import subject.Subject;

/**
 * Observer 【观察者接口】
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
