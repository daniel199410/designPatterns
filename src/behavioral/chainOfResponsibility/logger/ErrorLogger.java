package behavioral.chainOfResponsibility.logger;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(LoggerType loggerType) {
        super(loggerType);
    }

    @Override
    protected String write(String message) {
        return String.format("ERROR %s", message);
    }
}
