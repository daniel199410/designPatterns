package creational.prototype.example1.after;

public class Notification implements Cloneable {
    private String email;
    private String message;
    private String subject;
    private String sender;
    private String attachedRoute;

    public Notification(String email, String message, String subject, String sender, String attachedRoute) {
        this.email = email;
        this.message = message;
        this.subject = subject.replaceAll("á", "aacute;").replaceAll("é", "eacute").trim().substring(3);
        this.sender = sender;
        this.attachedRoute = attachedRoute.replaceAll("/+", "/").trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getAttachedRoute() {
        return attachedRoute;
    }

    public void setAttachedRoute(String attachedRoute) {
        this.attachedRoute = attachedRoute;
    }

    @Override
    public Notification clone() throws CloneNotSupportedException {
        return ((Notification) super.clone());
    }
}
