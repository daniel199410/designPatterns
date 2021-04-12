package behavioral.chainOfResponsibility.logger;

import java.util.Date;

public abstract class AbstractLogger {
    protected final LoggerType level;
    protected AbstractLogger nextLogger;

    protected AbstractLogger(LoggerType loggerType) {
        this.level = loggerType;
    }

    private void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public static AbstractLogger getLogger() {
        AbstractLogger errorLogger = new ErrorLogger(LoggerType.ERROR);
        AbstractLogger warningLogger = new WarningLogger(LoggerType.WARNING);
        AbstractLogger infoLogger = new InfoLogger(LoggerType.INFO);
        AbstractLogger debugLogger = new DebugLogger(LoggerType.DEBUG);
        debugLogger.setNextLogger(errorLogger);
        warningLogger.setNextLogger(debugLogger);
        infoLogger.setNextLogger(warningLogger);
        return infoLogger;
    }

    public String logMessage(LoggerType loggerType, String message) {
        if(this.level.equals(loggerType)) {
            return String.format("%s %s", new Date(), write(message));
        }
        if(nextLogger != null) {
            return nextLogger.logMessage(loggerType, message);
        }
        return "";
    }

    abstract protected String write(String message);
}
