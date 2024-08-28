package com.databricks.sdk.core.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CustomRoutePlannerTest {

  private static HttpHost proxy;
  private static HttpRoutePlanner customRoutePlanner;
  private static HttpContext context;

  @BeforeAll
  public static void setUp() {
    proxy = new HttpHost("proxy.example.com", 8080);
    String nonProxyHosts =
        String.join("|", Arrays.asList("example.com", "localhost", "*.mydomain.com"));
    customRoutePlanner = new CustomRoutePlanner(proxy, nonProxyHosts);
    context = new BasicHttpContext();
  }

  @Test
  public void testDirectRouteForExactNonProxyHost() throws Exception {
    // Test a host that should bypass the proxy
    HttpHost target = new HttpHost("example.com", 80);
    HttpRoute route =
        customRoutePlanner.determineRoute(target, new BasicHttpRequest("GET", "/"), context);

    // Assert that the route is direct (no proxy)
    assertEquals(target, route.getTargetHost());
    assertNull(route.getProxyHost());
  }

  @Test
  public void testDirectRouteForWildcardNonProxyHost() throws Exception {
    // Test a host that matches the wildcard pattern (*.mydomain.com)
    HttpHost target = new HttpHost("api.mydomain.com", 80);
    HttpRoute route =
        customRoutePlanner.determineRoute(target, new BasicHttpRequest("GET", "/"), context);

    // Assert that the route is direct (no proxy)
    assertEquals(target, route.getTargetHost());
    assertNull(route.getProxyHost());
  }

  @Test
  public void testDirectRouteForLocalhost() throws Exception {
    // Test a localhost, which should bypass the proxy
    HttpHost target = new HttpHost("localhost", 80);
    HttpRoute route =
        customRoutePlanner.determineRoute(target, new BasicHttpRequest("GET", "/"), context);

    // Assert that the route is direct (no proxy)
    assertEquals(target, route.getTargetHost());
    assertNull(route.getProxyHost());
  }

  @Test
  public void testProxyRouteForNonMatchingHost() throws Exception {
    // Test a host that does not match the non-proxy patterns
    HttpHost target = new HttpHost("otherdomain.com", 80);
    HttpRoute route =
        customRoutePlanner.determineRoute(target, new BasicHttpRequest("GET", "/"), context);

    // Assert that the route goes through the proxy
    assertEquals(target, route.getTargetHost());
    assertEquals(proxy, route.getProxyHost());
  }

  @Test
  public void testProxyRouteForPartialWildcardMatch() throws Exception {
    // Test a host that does not fully match the wildcard pattern (*.mydomain.com)
    HttpHost target = new HttpHost("mydomain.org", 80);
    HttpRoute route =
        customRoutePlanner.determineRoute(target, new BasicHttpRequest("GET", "/"), context);

    // Assert that the route goes through the proxy
    assertEquals(target, route.getTargetHost());
    assertEquals(proxy, route.getProxyHost());
  }
}
