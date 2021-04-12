package behavioral.chainOfResponsibility.logger;

public class InfoLogger extends AbstractLogger {
    public InfoLogger(LoggerType info) {
        super(info);
    }

    @Override
    protected String write(String message) {
        return String.format("INFO %s", message);
    }
}
