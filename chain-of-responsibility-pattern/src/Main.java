import factory.DebugLogger;
import factory.ErrorLogger;
import factory.InfoLogger;

public class Main {
    public static void main(String[] args) {
        ErrorLogger errorLogger = new ErrorLogger();
        InfoLogger infoLogger = new InfoLogger();
        DebugLogger debugLogger = new DebugLogger();

        errorLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);

        errorLogger.log();
    }
}