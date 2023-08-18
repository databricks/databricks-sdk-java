package com.databricks.sdk.core.http;

import com.databricks.sdk.core.DatabricksException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
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
  private final Map<String, List<String>> query = new TreeMap<>();
  private final InputStream body;
  private final String debugBody;

  public Request(String method, String url) {
    this(method, url, (String) null);
  }

  public Request(String method, String url, String body) {
    this.method = method;
    this.url = url;
    this.body =
        body != null ? new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8)) : null;
    this.debugBody = body;
  }

  public Request(String method, String url, InputStream body, String debugBody) {
    this.method = method;
    this.url = url;
    this.body = body;
    this.debugBody = debugBody;
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
    List<String> values = query.computeIfAbsent(key, k -> new ArrayList<>());
    values.add(value);
    return this;
  }

  public Request withUrl(String url) {
    this.url = url;
    return this;
  }

  protected static String mapToQuery(Map<String, List<String>> in) {
    StringJoiner joiner = new StringJoiner("&");
    for (Map.Entry<String, List<String>> entry : in.entrySet()) {
      try {
        String encodedKey = URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8.name());
        for (String value : entry.getValue()) {
          String encodedValue = URLEncoder.encode(value, StandardCharsets.UTF_8.name());
          joiner.add(encodedKey + "=" + encodedValue);
        }
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
      // We need to construct the query by hand and cannot use the new URI(uri.getScheme(),
      // uri.getAuthority(),
      // uri.getPath(), rawQuery, uri.getFragment()) constructor. This constructor does not
      // percent-encode certain
      // characters in the query, such as '/'. Instead, the query is encoded here, and the complete
      // URI is passed into
      // the new URI(String) constructor, which assumes that the URI is already encoded.
      StringBuilder updatedUriString = new StringBuilder();
      if (uri.getScheme() != null) {
        updatedUriString.append(uri.getScheme()).append("://");
      }
      if (uri.getAuthority() != null) {
        updatedUriString.append(uri.getAuthority());
      }
      updatedUriString.append(uri.getPath());
      if (!rawQuery.isEmpty()) {
        updatedUriString.append("?").append(rawQuery);
      }
      if (uri.getFragment() != null) {
        updatedUriString.append("#").append(uri.getFragment());
      }
      return URI.create(updatedUriString.toString());
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

  public Map<String, List<String>> getQuery() {
    return query;
  }

  public InputStream getBody() {
    return body;
  }

  public String getDebugBody() {
    return debugBody;
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
    // Note: this is not safe for production, as debugBody will be the same for different requests
    // using InputStream.
    // It is currently only used in tests.
    return Objects.hash(method, url, query, debugBody);
  }

  @Override
  public String toString() {
    return getRequestLine();
  }
}
