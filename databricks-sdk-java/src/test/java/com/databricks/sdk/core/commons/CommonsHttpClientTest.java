package com.databricks.sdk.core.commons;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.util.*;

import com.sun.net.httpserver.Headers;
import org.junit.jupiter.api.Test;

class CommonsHttpClientTest {
  @Test
  public void itWorks() throws IOException {
    try (FixtureServer fixtures = new FixtureServer().with("GET", "/foo?x=y", "bar")) {
      HttpClient httpClient = new CommonsHttpClient(30);
      Request in = new Request("GET", fixtures.getUrl() + "/foo").withQueryParam("x", "y");
      Response out = httpClient.execute(in);
      assertEquals("bar", out.getDebugBody().trim());
    }
  }

  // Test that requests with a string body are sent with no Transfer-Encoding header and with a Content-Length header.
  @Test
  public void testStringBody() throws IOException {
    FixtureServer.FixtureMapping fixture = new FixtureServer.FixtureMapping.Builder()
        .validatePath("/foo")
        .validateMethod("POST")
        .validateHeadersPresent(Collections.singletonMap("Content-Length", Collections.singletonList("3")))
        .validateHeadersAbsent(Collections.singletonList("Transfer-Encoding"))
        .withResponse("quux")
        .build();
    try (FixtureServer fixtures = new FixtureServer().with(fixture)) {
      HttpClient httpClient = new CommonsHttpClient(30);
      Request in = new Request("POST", fixtures.getUrl() + "/foo", "bar");
      Response out = httpClient.execute(in);
      assertEquals("quux", out.getDebugBody().trim());
    }
  }
}
