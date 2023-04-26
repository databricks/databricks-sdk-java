package com.databricks.sdk.client.http;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * <p>Response class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Response {
  private Request request;
  private int statusCode;
  private String status;
  private Map<String, List<String>> headers;
  private String body;

  /**
   * <p>Constructor for Response.</p>
   *
   * @param request a {@link com.databricks.sdk.client.http.Request} object
   * @param statusCode a int
   * @param status a {@link java.lang.String} object
   * @param headers a {@link java.util.Map} object
   * @param body a {@link java.lang.String} object
   */
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

  /**
   * <p>Constructor for Response.</p>
   *
   * @param body a {@link java.lang.String} object
   */
  public Response(String body) {
    this(new Request("GET", "/"), 200, "OK", Collections.emptyMap(), body);
  }

  /**
   * <p>Getter for the field <code>request</code>.</p>
   *
   * @return a {@link com.databricks.sdk.client.http.Request} object
   */
  public Request getRequest() {
    return request;
  }

  /**
   * <p>Getter for the field <code>statusCode</code>.</p>
   *
   * @return a int
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStatus() {
    return status;
  }

  /**
   * <p>getAllHeaders.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, List<String>> getAllHeaders() {
    return headers;
  }

  /**
   * <p>Getter for the field <code>headers</code>.</p>
   *
   * @param key a {@link java.lang.String} object
   * @return a {@link java.util.List} object
   */
  public List<String> getHeaders(String key) {
    return headers.get(key);
  }

  /**
   * <p>getFirstHeader.</p>
   *
   * @param key a {@link java.lang.String} object
   * @return a {@link java.lang.String} object
   */
  public String getFirstHeader(String key) {
    List<String> hs = headers.get(key);
    if (hs == null || hs.isEmpty()) {
      return null;
    }
    return hs.get(0);
  }

  /**
   * <p>Getter for the field <code>body</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getBody() {
    return body;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return String.format("%d %s", statusCode, status);
  }
}
