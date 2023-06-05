package observer;

import subject.Subject;

/**
 * HexObserver
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        // 添加观察者
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String：" + Integer.toHexString(subject.getNumber()));
    }
}
