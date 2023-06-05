package observer;

import subject.Subject;

/**
 * OctalObserver
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        // 添加观察者
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String：" + Integer.toOctalString(subject.getNumber()));
    }
}
