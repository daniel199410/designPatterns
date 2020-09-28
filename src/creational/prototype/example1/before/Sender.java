package creational.prototype.example1.before;

import java.util.List;
import java.util.stream.Collectors;

public class Sender {

    public static List<Notification> createNotifications(List<String> emails) {
        String message = "Same message for everyone";
        String subject = "Subject";
        String sender = "Same sender";
        String attachedRoute = "Same route";
        return emails
                .stream()
                .map(email -> new Notification(email, message, subject, sender, attachedRoute))
                .collect(Collectors.toList());
    }
}
