package structural.adapter.example2.client;

import structural.adapter.example2.unmodifiableExternalApi.ExternalSDKLibrary;

public class JSonToXMLAdapterImpl implements JSONToXMLAdapter {
    private final Request request;

    public JSonToXMLAdapterImpl(Request request) {
        this.request = request;
    }

    public boolean makeRequest() {
        ExternalSDKLibrary externalSDKLibrary = convertToXML();
        return externalSDKLibrary.makeRequest();
    }

    private ExternalSDKLibrary convertToXML() {
        return new ExternalSDKLibrary("<?xml>" + request.getMessage());
    }
}
