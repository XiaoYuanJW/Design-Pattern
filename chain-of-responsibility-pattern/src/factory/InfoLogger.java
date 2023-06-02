package factory;

/**
 * InfoLogger
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class InfoLogger extends AbstractLogger {
    @Override
    public void write() {
        System.out.println("Info Logging");
    }
}
