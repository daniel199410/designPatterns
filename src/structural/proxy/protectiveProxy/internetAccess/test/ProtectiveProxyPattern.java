package structural.proxy.protectiveProxy.internetAccess.test;

import org.junit.Test;
import structural.proxy.protectiveProxy.internetAccess.proxy.ProxyInternetAccess;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProtectiveProxyPattern {
    @Test
    public void shouldNotAllowInternetAccessToRole2() {
        ProxyInternetAccess proxyInternetAccess = new ProxyInternetAccess(3);
        assertFalse(proxyInternetAccess.grantInternetAccess());
    }

    @Test
    public void shouldAllowInternetAccessToRole1() {
        ProxyInternetAccess proxyInternetAccess = new ProxyInternetAccess(1);
        assertTrue(proxyInternetAccess.grantInternetAccess());
    }
}
