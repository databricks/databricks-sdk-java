package com.databricks.sdk.client.http;

import com.databricks.sdk.client.BodyLogger;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Response {
  private Request request;
  private int statusCode;
  private String status;
  private Map<String, List<String>> headers;
  private String body;

  public Response(
      Request request,
      int statusCode,
      String status,
      Map<String, List<String>> headers,
      String body) {
    this.request = request;
    this.statusCode = statusCode;
    this.status = status;
    this.headers = headers;
    this.body = body;
  }

  public Response(String body) {
    this(new Request("GET", "/"), 200, "OK", Collections.emptyMap(), body);
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

  public String getBody() {
    return body;
  }

  @Override
  public String toString() {
    return String.format("%d %s", statusCode, status);
  }

  public String toDebugString(BodyLogger bodyLogger) {
    StringBuilder sb = new StringBuilder();
    sb.append("\n< ");
    sb.append(toString());
    for (String line : bodyLogger.redactedDump(getBody()).split("\n")) {
      sb.append("\n< ");
      sb.append(line);
    }
    return sb.toString();
  }
}
