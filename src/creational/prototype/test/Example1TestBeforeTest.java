package creational.prototype.test;

import creational.prototype.example1.before.Sender;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Example1TestBeforeTest {
    @Test
    public void shouldSend3Notifications() {
        assertEquals(3, Sender.createNotifications(Arrays.asList("abc@g.com", "cbd@g.com", "fgt@g.com")).size());
    }
}
