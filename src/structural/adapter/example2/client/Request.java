package structural.adapter.example2.client;

public class Request {
    private String message;

    public Request(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
