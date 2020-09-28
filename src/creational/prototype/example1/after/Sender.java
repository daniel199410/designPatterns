package creational.prototype.example1.after;

import java.util.List;
import java.util.stream.Collectors;

public class Sender {

    public static List<Notification> createNotifications(List<String> emails) {
        Notification notification = new Notification("", "Message", "Subject", "Sender", "route");
        return emails
                .stream()
                .map(email -> {
                    try {
                        Notification notification1 = notification.clone();
                        notification1.setEmail(email);
                        return notification1;
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                        return new Notification("", "Message", "Subject", "Sender", "route");
                    }
                })
                .collect(Collectors.toList());
    }

}
