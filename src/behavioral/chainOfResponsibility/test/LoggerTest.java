package behavioral.chainOfResponsibility.test;

import behavioral.chainOfResponsibility.logger.AbstractLogger;
import behavioral.chainOfResponsibility.logger.LoggerType;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LoggerTest {
    @Test
    public void shouldLogDebug() {
        AbstractLogger abstractLogger = AbstractLogger.getLogger();
        String log =  abstractLogger.logMessage(LoggerType.DEBUG, "message");
        assertTrue(log.contains("DEBUG"));
    }

    @Test
    public void shouldLogError() {
        AbstractLogger abstractLogger = AbstractLogger.getLogger();
        String log =  abstractLogger.logMessage(LoggerType.ERROR, "message");
        assertTrue(log.contains("ERROR"));
    }

    @Test
    public void shouldLogWarn() {
        AbstractLogger abstractLogger = AbstractLogger.getLogger();
        String log =  abstractLogger.logMessage(LoggerType.WARNING, "message");
        assertTrue(log.contains("WARN"));
    }
}
