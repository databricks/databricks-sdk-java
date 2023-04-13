package com.databricks.sdk.client.http;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import org.junit.jupiter.api.Test;

class RequestTest {

  @Test
  void requestUriJustPath() {
    URI uri = new Request("GET", "/foo").getUri();
    assertEquals("/foo", uri.toString());
  }

  @Test
  void requestUriWithQuery() {
    URI uri = new Request("GET", "/foo").withQueryParam("foo", "bar").getUri();
    assertEquals("/foo?foo=bar", uri.toString());
  }

  @Test
  void requestUriMergeQuery() {
    URI uri = new Request("GET", "/foo?api=1.0").withQueryParam("foo", "bar").getUri();
    assertEquals("/foo?api=1.0&foo=bar", uri.toString());
  }
}
