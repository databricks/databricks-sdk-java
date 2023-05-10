package com.databricks.sdk.core.commons;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class CommonsHttpClientTest {
  @Test
  public void itWorks() throws IOException {
    try (FixtureServer fixtures = new FixtureServer().with("GET /foo?x=y", "bar")) {
      HttpClient httpClient = new CommonsHttpClient(30);
      Request in = new Request("GET", fixtures.getUrl() + "/foo").withQueryParam("x", "y");
      Response out = httpClient.execute(in);
      assertEquals("bar", out.getBody().trim());
    }
  }
}
