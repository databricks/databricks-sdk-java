package com.databricks.sdk.client.http;

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Request {
  private final String method;
  private String url;
  private final Map<String, String> headers = new HashMap<>();
  private final Map<String, String> query = new TreeMap<>();
  private String body;

  public Request(String method, String url) {
    this(method, url, "");
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

  public URI getUri() {
    if (!query.isEmpty()) {
      url +=
          "?"
              + query.entrySet().stream()
                  .map(
                      e ->
                          e.getKey()
                              + "="
                              + URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8))
                  .collect(Collectors.joining("&"));
    }
    return URI.create(url);
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
    return new StringJoiner(", ", Request.class.getSimpleName() + "[", "]")
        .add("method='" + method + "'")
        .add("url='" + url + "'")
        .add("query=" + query)
        .toString();
  }
}
