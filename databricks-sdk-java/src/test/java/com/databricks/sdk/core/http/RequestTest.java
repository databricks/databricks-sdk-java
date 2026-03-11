package com.databricks.sdk.core.http;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RequestTest {

  @ParameterizedTest(name = "{0}")
  @MethodSource("getUriCases")
  void getUri(String name, Request request, String expectedUri) {
    URI uri = request.getUri();
    assertEquals(expectedUri, uri.toString());
  }

  static Stream<Arguments> getUriCases() {
    return Stream.of(
        Arguments.of(
            "just path",
            new Request("GET", "/foo"),
            "/foo"),
        Arguments.of(
            "with query param",
            new Request("GET", "/foo").withQueryParam("foo", "bar"),
            "/foo?foo=bar"),
        Arguments.of(
            "merge query into existing",
            new Request("GET", "/foo?api=1.0").withQueryParam("foo", "bar"),
            "/foo?api=1.0&foo=bar"),
        Arguments.of(
            "forward-slash encoded in query param",
            new Request("GET", "/foo").withQueryParam("foo", "bar/baz"),
            "/foo?foo=bar%2Fbaz"),
        Arguments.of(
            "multiple values for same query param",
            new Request("GET", "/foo")
                .withQueryParam("foo", "bar")
                .withQueryParam("foo", "baz"),
            "/foo?foo=bar&foo=baz"),
        Arguments.of(
            "pre-encoded pipe in path",
            new Request("GET", String.format("/api/2.1/tables/%s",
                Encoding.encodeMultiSegmentPathParameter("name|here"))),
            "/api/2.1/tables/name%7Chere"),
        Arguments.of(
            "pre-encoded path with query params preserves encoding",
            new Request("GET", String.format("/api/2.1/tables/%s",
                Encoding.encodeMultiSegmentPathParameter("name|here")))
                .withQueryParam("key", "value"),
            "/api/2.1/tables/name%7Chere?key=value"),
        Arguments.of(
            "pre-encoded path with full URL preserves encoding",
            new Request("GET", "/ignored")
                .withUrl("https://host.example.com" + String.format("/api/2.1/tables/%s",
                    Encoding.encodeMultiSegmentPathParameter("name|here"))),
            "https://host.example.com/api/2.1/tables/name%7Chere"));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("getRequestLineCases")
  void getRequestLine(String name, Request request, String expectedLine) {
    assertEquals(expectedLine, request.getRequestLine());
  }

  static Stream<Arguments> getRequestLineCases() {
    return Stream.of(
        Arguments.of(
            "simple path",
            new Request("GET", "/foo"),
            "GET /foo"),
        Arguments.of(
            "path with query param",
            new Request("GET", "/foo").withQueryParam("key", "value"),
            "GET /foo?key=value"),
        Arguments.of(
            "encoded path preserves encoding in request line",
            new Request("GET", String.format("/api/2.1/tables/%s",
                Encoding.encodeMultiSegmentPathParameter("name|here"))),
            "GET /api/2.1/tables/name%7Chere"),
        Arguments.of(
            "encoded path with query preserves encoding in request line",
            new Request("GET", String.format("/api/2.1/tables/%s",
                Encoding.encodeMultiSegmentPathParameter("name|here")))
                .withQueryParam("key", "val/ue"),
            "GET /api/2.1/tables/name%7Chere?key=val%2Fue"));
  }
}
