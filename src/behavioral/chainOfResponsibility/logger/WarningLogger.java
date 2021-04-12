package behavioral.chainOfResponsibility.logger;

public class WarningLogger extends AbstractLogger{

    public WarningLogger(LoggerType loggerType) {
        super(loggerType);
    }

    @Override
    protected String write(String message) {
        return String.format("WARN %s", message);
    }
}
