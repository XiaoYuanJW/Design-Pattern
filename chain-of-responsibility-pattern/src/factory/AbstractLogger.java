package factory;

/**
 * AbstractLogger
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public abstract class AbstractLogger {
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log() {
        write();
        if (nextLogger != null) {
            nextLogger.log();
        }
    }

    protected abstract void write();
}
