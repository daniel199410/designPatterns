package behavioral.chainOfResponsibility.logger;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(LoggerType loggerType) {
        super(loggerType);
    }

    @Override
    protected String write(String message) {
        return String.format("DEBUG %s", message);
    }
}
