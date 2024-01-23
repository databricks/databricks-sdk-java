package com.databricks.sdk.core.commons;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.*;
import org.apache.commons.io.IOUtils;
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

  // Test that requests with a string body are sent with no Transfer-Encoding header and with a
  // Content-Length header.
  @Test
  public void testStringBody() throws IOException {
    FixtureServer.FixtureMapping fixture =
        new FixtureServer.FixtureMapping.Builder()
            .validatePath("/foo")
            .validateMethod("POST")
            .validateHeadersPresent(
                Collections.singletonMap("Content-Length", Collections.singletonList("3")))
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

  // Test that requests with an InputStream body are sent with a Transfer-Encoding header and
  // without a Content-Length header.
  @Test
  public void testInputStreamBody() throws IOException {
    FixtureServer.FixtureMapping fixture =
        new FixtureServer.FixtureMapping.Builder()
            .validatePath("/foo")
            .validateMethod("POST")
            .validateHeadersPresent(
                Collections.singletonMap("Transfer-Encoding", Collections.singletonList("chunked")))
            .validateHeadersAbsent(Collections.singletonList("Content-Length"))
            .withResponse("quux")
            .build();
    try (FixtureServer fixtures = new FixtureServer().with(fixture)) {
      HttpClient httpClient = new CommonsHttpClient(30);
      Request in =
          new Request("POST", fixtures.getUrl() + "/foo", IOUtils.toInputStream("bar", "UTF-8"));
      Response out = httpClient.execute(in);
      assertEquals("quux", out.getDebugBody().trim());
    }
  }

  @Test
  public void testRedirection() throws IOException {
    FixtureServer.FixtureMapping fixture =
        new FixtureServer.FixtureMapping.Builder()
            .validatePath("/redirect")
            .validateMethod("GET")
            .withRedirect("http://example.com", HttpURLConnection.HTTP_MOVED_TEMP)
            .build();

    try (FixtureServer fixtures = new FixtureServer().with(fixture)) {
      HttpClient httpClient = new CommonsHttpClient(30);
      Request in = new Request("GET", fixtures.getUrl() + "/redirect");
      in.setRedirectionBehavior(
          false); // If we don't set redirection behavior to false, we get 200 as it gets
      // redirected automatically.
      Response out = httpClient.execute(in);
      assertEquals(HttpURLConnection.HTTP_MOVED_TEMP, out.getStatusCode());
      assertTrue(out.getAllHeaders().containsKey("Location"));
      assertEquals("http://example.com", out.getHeaders("Location").get(0));
    }
  }
}
