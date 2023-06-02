package factory;

/**
 * DebugLogger
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class DebugLogger extends AbstractLogger{
    @Override
    public void write() {
        System.out.println("Debug Logging");
    }
}
