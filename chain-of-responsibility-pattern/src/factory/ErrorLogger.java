package factory;

/**
 * ErrorLogger
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class ErrorLogger extends AbstractLogger {
    @Override
    public void write() {
        System.out.println("Error Logging");
    }
}
