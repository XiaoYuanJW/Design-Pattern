package observer;

import subject.Subject;

/**
 * BinaryObserver
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        // 添加观察者
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String：" + Integer.toBinaryString(subject.getNumber()));
    }
}
