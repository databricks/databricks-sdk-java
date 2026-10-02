package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.fail;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.opentest4j.AssertionFailedError;

public class FixtureServer implements Closeable {
  public interface Validation {
    void validate(HttpExchange exchange) throws IOException;
  }

  public static class FixtureMapping {
    public static class Builder {
      private ArrayList<Validation> validations = new ArrayList<>();
      private String response;
      private int statusCode;
      private Map<String, List<String>> responseHeaders;
      private String redirectUrl;
      private int redirectStatusCode;

      public Builder validateMethod(String method) {
        this.validations.add(
            (exchange) -> {
              if (!exchange.getRequestMethod().equals(method)) {
                fail("Expected method " + method + " but got " + exchange.getRequestMethod());
              }
            });
        return this;
      }

      public Builder validatePath(String path) {
        this.validations.add(
            (exchange) -> {
              if (!exchange.getRequestURI().toString().equals(path)) {
                fail("Expected path " + path + " but got " + exchange.getRequestURI().getPath());
              }
            });
        return this;
      }

      public Builder validateHeadersPresent(Map<String, List<String>> headers) {
        this.validations.add(
            (exchange) -> {
              for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                String key = entry.getKey();
                List<String> values = entry.getValue();
                for (String value : values) {
                  List<String> actualValues = exchange.getRequestHeaders().get(key);
                  if (actualValues == null) {
                    fail(
                        "Expected header "
                            + key
                            + " with value "
                            + value
                            + " but got no header with that key");
                  }
                  if (!actualValues.contains(value)) {
                    fail(
                        "Expected header "
                            + key
                            + " with value "
                            + value
                            + " but got "
                            + exchange.getRequestHeaders().get(key));
                  }
                }
              }
            });
        return this;
      }

      public Builder validateHeadersAbsent(List<String> headers) {
        this.validations.add(
            (exchange) -> {
              for (String header : headers) {
                if (exchange.getRequestHeaders().containsKey(header)) {
                  fail("Expected header " + header + " to be absent but it was present");
                }
              }
            });
        return this;
      }

      public Builder validateBody(String body) {
        this.validations.add(
            (exchange) -> {
              String bodyString =
                  IOUtils.toString(exchange.getRequestBody(), StandardCharsets.UTF_8);
              if (!bodyString.equals(body)) {
                fail("Expected body " + body + " but got " + bodyString);
              }
            });
        return this;
      }

      public Builder validate(Validation validation) {
        this.validations.add(validation);
        return this;
      }

      public Builder withResponse(String response, int statusCode) {
        this.response = response;
        this.statusCode = statusCode;
        return this;
      }

      public Builder withResponseHeaders(Map<String, List<String>> responseHeaders) {
        this.responseHeaders = responseHeaders;
        return this;
      }

      public Builder withRedirect(String redirectUrl, int redirectStatusCode) {
        this.redirectUrl = redirectUrl;
        this.redirectStatusCode = redirectStatusCode;
        return this;
      }

      public FixtureMapping build() {
        Validation validation =
            (exchange) -> {
              for (Validation v : validations) {
                v.validate(exchange);
              }
            };
        return new FixtureMapping(
            validation, response, responseHeaders, redirectUrl, redirectStatusCode, statusCode);
      }
    }

    private final Validation validation;
    private final String response;
    private final Map<String, List<String>> responseHeaders;
    private String redirectUrl;
    private int redirectStatusCode;
    private int statusCode;

    FixtureMapping(Validation validation, String response) {
      this.validation = validation;
      this.response = response;
      this.responseHeaders = null;
    }

    FixtureMapping(
        Validation validation,
        String response,
        Map<String, List<String>> responseHeaders,
        String redirectUrl,
        int redirectStatusCode,
        int statusCode) {
      this.validation = validation;
      this.response = response;
      this.responseHeaders = responseHeaders;
      this.redirectUrl = redirectUrl;
      this.redirectStatusCode = redirectStatusCode;
      this.statusCode = statusCode;
    }

    Validation getValidation() {
      return validation;
    }

    String getResponse() {
      return response;
    }

    Map<String, List<String>> getResponseHeaders() {
      return responseHeaders;
    }

    int getStatusCode() {
      return statusCode;
    }

    public String getRedirectUrl() {
      return redirectUrl;
    }

    public int getRedirectStatusCode() {
      return redirectStatusCode;
    }
  }

  private static final String WELL_KNOWN_PATH = "/.well-known/databricks-config";

  private final HttpServer server;
  private final List<FixtureMapping> fixtures = new ArrayList<>();
  private boolean hasWellKnownFixture = false;

  public FixtureServer() throws IOException {
    HttpHandler handler = new FixtureHandler();
    server = HttpServer.create(new InetSocketAddress("localhost", 0), 0);
    server.createContext("/", handler);
    server.start();
  }

  class FixtureHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
      try {
        handlerInner(exchange);
      } catch (Exception e) {
        respondInternalServerError(exchange, e.getMessage());
      }
    }

    private void handlerInner(HttpExchange exchange) throws IOException {
      // Auto-stub the host metadata endpoint with 404 to prevent config resolution
      // from interfering with test assertions. This handles two cases:
      // 1. No well-known fixture registered: always auto-stub.
      // 2. Well-known fixtures registered but queue is empty (already consumed): auto-stub
      //    so that repeated calls (e.g. resolve() + explicit getHostMetadata()) don't fail.
      if ("GET".equals(exchange.getRequestMethod())
          && "/.well-known/databricks-config".equals(exchange.getRequestURI().getPath())
          && (!hasWellKnownFixture || fixtures.isEmpty())) {
        respond(
            exchange,
            404,
            "{\"error_code\":\"NOT_FOUND\",\"message\":\"auto-stubbed by test framework\"}",
            null);
        return;
      }

      if (fixtures.isEmpty()) {
        respondInternalServerError(exchange, "No fixtures defined");
        return;
      }

      FixtureMapping response = fixtures.remove(0);

      try {
        response.getValidation().validate(exchange);
      } catch (AssertionFailedError e) {
        respondBadRequest(exchange, e.getMessage());
        return;
      }
      if (response.getRedirectUrl() != null) {
        respondRedirect(exchange, response.getRedirectUrl(), response.getRedirectStatusCode());
        return;
      }
      respondSuccess(
          exchange,
          response.getResponse(),
          response.getStatusCode(),
          response.getResponseHeaders());
    }

    private void respond(
        HttpExchange exchange,
        int statusCode,
        String body,
        Map<String, List<String>> responseHeaders)
        throws IOException {
      Headers headers = exchange.getResponseHeaders();
      headers.add("Connection", "close");
      if (responseHeaders != null) {
        for (Map.Entry<String, List<String>> entry : responseHeaders.entrySet()) {
          headers.put(entry.getKey(), entry.getValue());
        }
      }
      if (responseHeaders == null
          || responseHeaders.keySet().stream()
              .noneMatch(name -> "Content-Type".equalsIgnoreCase(name))) {
        headers.add("Content-Type", "text/plain");
      }
      byte[] responseBody = body.getBytes(StandardCharsets.UTF_8);
      long responseLength = "HEAD".equals(exchange.getRequestMethod()) ? -1 : responseBody.length;
      exchange.sendResponseHeaders(statusCode, responseLength);
      exchange.getResponseBody().write(responseBody);
      exchange.close();
    }

    private void respondBadRequest(HttpExchange exchange, String body) throws IOException {
      respond(exchange, 400, body, null);
    }

    private void respondInternalServerError(HttpExchange exchange, String body) throws IOException {
      respond(exchange, 500, body, null);
    }

    private void respondSuccess(
        HttpExchange exchange,
        String body,
        int statusCode,
        Map<String, List<String>> responseHeaders)
        throws IOException {
      respond(exchange, statusCode, body, responseHeaders);
    }

    private void respondRedirect(HttpExchange exchange, String location, int statusCode)
        throws IOException {
      Headers headers = exchange.getResponseHeaders();
      headers.add("Location", location);
      respond(exchange, statusCode, "", null);
    }
  }

  public FixtureServer with(String method, String path, String response, int statusCode) {
    if (WELL_KNOWN_PATH.equals(path)) {
      hasWellKnownFixture = true;
    }
    FixtureMapping fixture =
        new FixtureMapping.Builder()
            .validateMethod(method)
            .validatePath(path)
            .withResponse(response, statusCode)
            .build();
    return with(fixture);
  }

  public FixtureServer with(FixtureMapping fixture) {
    fixtures.add(fixture);
    return this;
  }

  public FixtureServer with(Collection<FixtureMapping> fs) {
    fixtures.addAll(fs);
    return this;
  }

  public void assertAllFixturesConsumed() {
    if (!fixtures.isEmpty()) {
      fail("Expected all HTTP fixtures to be consumed, but " + fixtures.size() + " remain");
    }
  }

  @Override
  public void close() {
    server.stop(0);
  }

  public String getUrl() {
    return "http://" + server.getAddress().getHostName() + ":" + server.getAddress().getPort();
  }
}
