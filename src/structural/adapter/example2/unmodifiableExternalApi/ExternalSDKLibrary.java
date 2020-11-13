package structural.adapter.example2.unmodifiableExternalApi;

public class ExternalSDKLibrary {
    private String body;

    public ExternalSDKLibrary(String body) {
        this.body = body;
    }

    public Boolean makeRequest() {
        return body.startsWith("<?xml>");
    }
}
