package com.databricks.sdk.client.http;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.*;

/**
 * <p>Request class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Request {
  /** Constant <code>GET="GET"</code> */
  public static final String GET = "GET";
  /** Constant <code>DELETE="DELETE"</code> */
  public static final String DELETE = "DELETE";
  /** Constant <code>POST="POST"</code> */
  public static final String POST = "POST";
  /** Constant <code>PUT="PUT"</code> */
  public static final String PUT = "PUT";
  /** Constant <code>PATCH="PATCH"</code> */
  public static final String PATCH = "PATCH";
  private final String method;
  private String url;
  private final Map<String, String> headers = new HashMap<>();
  private final Map<String, String> query = new TreeMap<>();
  private String body;

  /**
   * <p>Constructor for Request.</p>
   *
   * @param method a {@link java.lang.String} object
   * @param url a {@link java.lang.String} object
   */
  public Request(String method, String url) {
    this(method, url, null);
  }

  /**
   * <p>Constructor for Request.</p>
   *
   * @param method a {@link java.lang.String} object
   * @param url a {@link java.lang.String} object
   * @param body a {@link java.lang.String} object
   */
  public Request(String method, String url, String body) {
    this.method = method;
    this.url = url;
    this.body = body;
  }

  /**
   * <p>withHeaders.</p>
   *
   * @param headers a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.client.http.Request} object
   */
  public Request withHeaders(Map<String, String> headers) {
    this.headers.putAll(headers);
    return this;
  }

  /**
   * <p>withHeader.</p>
   *
   * @param key a {@link java.lang.String} object
   * @param value a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.http.Request} object
   */
  public Request withHeader(String key, String value) {
    headers.put(key, value);
    return this;
  }

  /**
   * <p>withQueryParam.</p>
   *
   * @param key a {@link java.lang.String} object
   * @param value a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.http.Request} object
   */
  public Request withQueryParam(String key, String value) {
    query.put(key, value);
    return this;
  }

  /**
   * <p>withUrl.</p>
   *
   * @param url a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.client.http.Request} object
   */
  public Request withUrl(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>mapToQuery.</p>
   *
   * @param in a {@link java.util.Map} object
   * @return a {@link java.lang.String} object
   */
  protected static String mapToQuery(Map<String, String> in) {
    StringJoiner joiner = new StringJoiner("&");
    for (Map.Entry<String, String> entry : in.entrySet()) {
      String encoded = URLEncoder.encode(entry.getValue()); // TODO: UTF-8?
      joiner.add(String.format("%s=%s", entry.getKey(), encoded));
    }
    return joiner.toString();
  }

  /**
   * <p>getUri.</p>
   *
   * @return a {@link java.net.URI} object
   */
  public URI getUri() {
    URI uri = URI.create(url);
    if (!query.isEmpty()) {
      String rawQuery = uri.getRawQuery();
      rawQuery = rawQuery == null ? "" : rawQuery + "&";
      rawQuery += mapToQuery(query);
      try {
        return new URI(
            uri.getScheme(), null, uri.getHost(), uri.getPort(), uri.getPath(), rawQuery, null);
      } catch (URISyntaxException e) {
        throw new IllegalArgumentException(e);
      }
    }
    return uri;
  }

  /**
   * <p>getRequestLine.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRequestLine() {
    URI uri = getUri();
    String path = uri.getPath();
    if (!query.isEmpty()) {
      path += "?" + uri.getQuery();
    }
    return String.format("%s %s", method, path);
  }

  /**
   * <p>Getter for the field <code>method</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMethod() {
    return method;
  }

  /**
   * <p>Getter for the field <code>url</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return url;
  }

  /**
   * <p>Getter for the field <code>headers</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getHeaders() {
    return headers;
  }

  /**
   * <p>Getter for the field <code>query</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getQuery() {
    return query;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Request request = (Request) o;
    return method.equals(request.method)
        && url.equals(request.url)
        && Objects.equals(query, request.query)
        && Objects.equals(body, request.body);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(method, url, query, body);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return getRequestLine();
  }
}
