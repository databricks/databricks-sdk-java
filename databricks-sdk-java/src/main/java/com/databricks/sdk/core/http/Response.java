package com.databricks.sdk.core.http;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Response {
  private Request request;
  private int statusCode;
  private String status;
  private Map<String, List<String>> headers;
  private InputStream body;
  private String debugBody;

  public Response(
      Request request, int statusCode, String status, Map<String, List<String>> headers) {
    this(request, statusCode, status, headers, (InputStream) null, null);
  }

  public Response(
      Request request,
      int statusCode,
      String status,
      Map<String, List<String>> headers,
      String body) {
    this(
        request,
        statusCode,
        status,
        headers,
        body != null ? new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8)) : null,
        body);
  }

  public Response(
      Request request,
      int statusCode,
      String status,
      Map<String, List<String>> headers,
      InputStream body) {
    this(request, statusCode, status, headers, body, "\"<InputStream>\"");
  }

  public Response(String body) {
    this(
        new Request("GET", "/"),
        200,
        "OK",
        Collections.emptyMap(),
        new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8)));
  }

  private Response(
      Request request,
      int statusCode,
      String status,
      Map<String, List<String>> headers,
      InputStream body,
      String debugBody) {
    this.request = request;
    this.statusCode = statusCode;
    this.status = status;
    this.headers = headers;
    this.body = body;
    this.debugBody = debugBody;
  }

  public Request getRequest() {
    return request;
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
    return headers.get(key);
  }

  public String getFirstHeader(String key) {
    List<String> hs = headers.get(key);
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
