package com.databricks.sdk.client.http;

import com.databricks.sdk.client.DatabricksException;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Request {
  public static final String GET = "GET";
  public static final String DELETE = "DELETE";
  public static final String POST = "POST";
  public static final String PUT = "PUT";
  public static final String PATCH = "PATCH";
  private final String method;
  private String url;
  private final Map<String, String> headers = new HashMap<>();
  private final Map<String, String> query = new TreeMap<>();
  private final String body;

  public Request(String method, String url) {
    this(method, url, null);
  }

  public Request(String method, String url, String body) {
    this.method = method;
    this.url = url;
    this.body = body;
  }

  public Request withHeaders(Map<String, String> headers) {
    this.headers.putAll(headers);
    return this;
  }

  public Request withHeader(String key, String value) {
    headers.put(key, value);
    return this;
  }

  public Request withQueryParam(String key, String value) {
    query.put(key, value);
    return this;
  }

  public Request withUrl(String url) {
    this.url = url;
    return this;
  }

  protected static String mapToQuery(Map<String, String> in) {
    StringJoiner joiner = new StringJoiner("&");
    for (Map.Entry<String, String> entry : in.entrySet()) {
      try {
        String encoded = URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8.name()); // TODO: UTF-8?
        joiner.add(String.format("%s=%s", entry.getKey(), encoded));
      } catch (UnsupportedEncodingException e) {
        throw new DatabricksException("Unable to encode query parameter: " + e.getMessage(), e);
      }
    }
    return joiner.toString();
  }

  public URI getUri() {
    URI uri = URI.create(url);
    if (!query.isEmpty()) {
      String rawQuery = uri.getRawQuery();
      rawQuery = rawQuery == null ? "" : rawQuery + "&";
      rawQuery += mapToQuery(query);
      try {
        String uriStr = uri.getScheme() + "://" + uri.getHost() + ":" + uri.getPort() + uri.getPath() + "?" + rawQuery;
        return new URI(uriStr);
      } catch (URISyntaxException e) {
        throw new IllegalArgumentException(e);
      }
    }
    return uri;
  }

  public String getRequestLine() {
    URI uri = getUri();
    String path = uri.getPath();
    if (!query.isEmpty()) {
      path += "?" + uri.getQuery();
    }
    return String.format("%s %s", method, path);
  }

  public String getMethod() {
    return method;
  }

  public String getUrl() {
    return url;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public Map<String, String> getQuery() {
    return query;
  }

  public String getBody() {
    return body;
  }

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

  @Override
  public int hashCode() {
    return Objects.hash(method, url, query, body);
  }

  @Override
  public String toString() {
    return getRequestLine();
  }
}
