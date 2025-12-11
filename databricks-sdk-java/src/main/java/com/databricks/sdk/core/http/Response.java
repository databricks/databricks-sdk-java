package com.databricks.sdk.core.http;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.InternalApi;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@InternalApi
public class Response {
  private Request request;
  private URL url;
  private int statusCode;
  private String status;
  private Map<String, List<String>> headers;
  private InputStream body;
  private String debugBody;

  public Response(
      Request request, int statusCode, String status, Map<String, List<String>> headers) {
    this(
        request, getURLFromRequest(request), statusCode, status, headers, (InputStream) null, null);
  }

  public Response(
      Request request, URL url, int statusCode, String status, Map<String, List<String>> headers) {
    this(request, url, statusCode, status, headers, (InputStream) null, null);
  }

  private static URL getURLFromRequest(Request request) {
    try {
      return request.getUri().toURL();
    } catch (MalformedURLException e) {
      throw new DatabricksException("Failed to convert URI to URL", e);
    }
  }

  public Response(
      Request request,
      int statusCode,
      String status,
      Map<String, List<String>> headers,
      String body) {
    this(
        request,
        getURLFromRequest(request),
        statusCode,
        status,
        headers,
        body != null ? new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8)) : null,
        body);
  }

  public Response(
      Request request,
      URL url,
      int statusCode,
      String status,
      Map<String, List<String>> headers,
      String body) {
    this(
        request,
        url,
        statusCode,
        status,
        headers,
        body != null ? new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8)) : null,
        body);
  }

  public Response(
      Request request,
      URL url,
      int statusCode,
      String status,
      Map<String, List<String>> headers,
      InputStream body) {
    this(request, url, statusCode, status, headers, body, "\"<InputStream>\"");
  }

  public Response(String body, int statusCode, String status, URL url) {
    this(
        new Request("GET", "/"),
        url,
        statusCode,
        status,
        Collections.emptyMap(),
        new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8)),
        body);
  }

  public Response(String body, URL url) {
    this(body, 200, "OK", url);
  }

  private Response(
      Request request,
      URL url,
      int statusCode,
      String status,
      Map<String, List<String>> headers,
      InputStream body,
      String debugBody) {
    this.request = request;
    this.url = url;
    this.statusCode = statusCode;
    this.status = status;
    this.headers = headers;
    this.body = body;
    this.debugBody = debugBody;
  }

  public Request getRequest() {
    return request;
  }

  public URL getUrl() {
    return url;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public String getStatus() {
    return status;
  }

  public Map<String, List<String>> getAllHeaders() {
    return headers;
  }

  public List<String> getHeaders(String key) {
    for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
      if (entry.getKey().equalsIgnoreCase(key)) {
        return entry.getValue();
      }
    }
    return null;
  }

  public String getFirstHeader(String key) {
    List<String> hs = getHeaders(key);
    if (hs == null || hs.isEmpty()) {
      return null;
    }
    return hs.get(0);
  }

  public InputStream getBody() {
    return body;
  }

  public String getDebugBody() {
    return debugBody;
  }

  @Override
  public String toString() {
    return String.format("%d %s", statusCode, status);
  }
}
