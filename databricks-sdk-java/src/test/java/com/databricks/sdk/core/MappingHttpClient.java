package com.databricks.sdk.core;

import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Minimal HTTP fixture that matches requests on {@code "METHOD path"} and returns a stubbed JSON
 * body with HTTP 200. Unmapped requests fail loudly so a missing fixture cannot silently fall
 * through.
 */
class MappingHttpClient implements HttpClient {
  private final Map<String, String> mappings = new HashMap<>();
  private final List<Request> requests = new ArrayList<>();

  MappingHttpClient put(String key, String jsonBody) {
    mappings.put(key, jsonBody);
    return this;
  }

  /**
   * Returns the only recorded request with the given HTTP method and URL path. The host and query
   * parameters are intentionally ignored so parameterized host-profile tests can inspect the
   * request body independently of the endpoint host. Fails when no request or multiple requests
   * match because either result would make the test assertion ambiguous.
   */
  Request singleRequest(String method, String path) {
    Request match = null;
    for (Request request : requests) {
      try {
        if (method.equals(request.getMethod())
            && path.equals(new URL(request.getUrl()).getPath())) {
          if (match != null) {
            throw new AssertionError("Multiple requests matched " + method + " " + path);
          }
          match = request;
        }
      } catch (IOException e) {
        throw new AssertionError("Invalid request URL", e);
      }
    }
    if (match == null) {
      throw new AssertionError("No request matched " + method + " " + path);
    }
    return match;
  }

  @Override
  public Response execute(Request request) throws IOException {
    requests.add(request);

    String rawUrl = request.getUrl();
    URL url = new URL(rawUrl);
    String key = request.getMethod() + " " + url.getPath();
    String body = mappings.get(key);
    if (body == null) {
      throw new IOException("No mock for " + key + " (url=" + rawUrl + ")");
    }

    return new Response(body, 200, "OK", url);
  }
}
