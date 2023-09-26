package com.databricks.sdk.core.commons;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CommonsHttpClientTest {
  @Test
  public void itWorks() throws IOException {
    try (FixtureServer fixtures = new FixtureServer()) {
      String[] expectedRequestLines = {
          "GET /foo?x=y HTTP/1.1",
          "Host: " + fixtures.getUrl().substring(7), // remove http:// prefix
          "Connection: Keep-Alive",
          "User-Agent: Apache-HttpClient/4.5.14 (Java/1.8.0_362)",
          "Accept-Encoding: gzip,deflate",
      };
      fixtures.with(Arrays.stream(expectedRequestLines).reduce((a, b) -> a + "\r\n" + b).get(), "bar");
      HttpClient httpClient = new CommonsHttpClient(30);
      Request in = new Request("GET", fixtures.getUrl() + "/foo").withQueryParam("x", "y");
      Response out = httpClient.execute(in);
      assertEquals("bar", out.getDebugBody().trim());
    }
  }

  // Test that requests with a string body are sent with no Transfer-Encoding header and with a Content-Length header.
  @Test
  public void testStringBody() throws IOException {
    try (FixtureServer fixtures = new FixtureServer()) {
      String[] expectedRequestLines = {
          "POST /foo HTTP/1.1",
          "Content-Length: 3",
          "Content-Type: text/plain; charset=UTF-8",
          "Host: " + fixtures.getUrl().substring(7), // remove http:// prefix
          "Connection: Keep-Alive",
          "User-Agent: Apache-HttpClient/4.5.14 (Java/1.8.0_362)",
          "Accept-Encoding: gzip,deflate",
          "",
          "bar"
      };
      fixtures.with(Arrays.stream(expectedRequestLines).reduce((a, b) -> a + "\r\n" + b).get(), "bar");
      HttpClient httpClient = new CommonsHttpClient(30);
      Request in = new Request("POST", fixtures.getUrl() + "/foo", "bar");
      Response out = httpClient.execute(in);
      assertEquals("bar", out.getDebugBody().trim());
    }
  }
}
