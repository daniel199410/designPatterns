package structural.adapter.test;

import org.junit.Test;
import structural.adapter.example2.client.JSonToXMLAdapterImpl;
import structural.adapter.example2.client.Request;
import structural.adapter.example2.unmodifiableExternalApi.ExternalSDKLibrary;

import static org.junit.Assert.assertTrue;

public class Example2Text {
    @Test
    public void shouldNotNeedAnAdapterOnXmlRequestBody() {
        Request request = new Request("<?xml>...");
        assertTrue(new ExternalSDKLibrary(request.getMessage()).makeRequest());
    }

    @Test
    public void ShouldNeedAnAdapterOnJSONRequestBody() {
        JSonToXMLAdapterImpl jSonToXMLAdapter = new JSonToXMLAdapterImpl(new Request("{\"campo\": \"valor\"}"));
        assertTrue(jSonToXMLAdapter.makeRequest());
    }
}
