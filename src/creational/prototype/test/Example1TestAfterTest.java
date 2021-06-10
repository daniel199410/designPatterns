package creational.prototype.test;

import creational.prototype.example1.after.Notification;
import creational.prototype.example1.after.Sender;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Example1TestAfterTest {

    @Test
    public void shouldSend3Notifications() {
        List<String> mails = Sender.createNotifications(Arrays.asList("abc@h.com", "abc@g.com", "abc@i.com"))
                .stream()
                .map(Notification::getEmail)
                .collect(Collectors.toList());
        assertEquals(Arrays.asList("abc@h.com", "abc@g.com", "abc@i.com"), mails);
    }

}
