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

      public Builder withResponse(String response) {
        this.response = response;
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
        return new FixtureMapping(validation, response, redirectUrl, redirectStatusCode);
      }
    }

    private final Validation validation;
    private final String response;
    private String redirectUrl;
    private int redirectStatusCode;

    FixtureMapping(Validation validation, String response) {
      this.validation = validation;
      this.response = response;
    }

    FixtureMapping(
        Validation validation, String response, String redirectUrl, int redirectStatusCode) {
      this.validation = validation;
      this.response = response;
      this.redirectUrl = redirectUrl;
      this.redirectStatusCode = redirectStatusCode;
    }

    Validation getValidation() {
      return validation;
    }

    String getResponse() {
      return response;
    }

    public String getRedirectUrl() {
      return redirectUrl;
    }

    public int getRedirectStatusCode() {
      return redirectStatusCode;
    }
  }

  private final HttpServer server;
  private final List<FixtureMapping> fixtures = new ArrayList<>();

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
      respondSuccess(exchange, response.getResponse());
    }

    private void respond(HttpExchange exchange, int statusCode, String body) throws IOException {
      Headers headers = exchange.getResponseHeaders();
      headers.add("Connection", "close");
      headers.add("Content-Type", "text/plain");
      exchange.sendResponseHeaders(statusCode, body.length());
      exchange.getResponseBody().write(body.getBytes());
      exchange.close();
    }

    private void respondBadRequest(HttpExchange exchange, String body) throws IOException {
      respond(exchange, 400, body);
    }

    private void respondInternalServerError(HttpExchange exchange, String body) throws IOException {
      respond(exchange, 500, body);
    }

    private void respondSuccess(HttpExchange exchange, String body) throws IOException {
      respond(exchange, 200, body);
    }

    private void respondRedirect(HttpExchange exchange, String location, int statusCode)
        throws IOException {
      Headers headers = exchange.getResponseHeaders();
      headers.add("Location", location);
      respond(exchange, statusCode, "");
    }
  }

  public FixtureServer with(String method, String path, String response) {
    FixtureMapping fixture =
        new FixtureMapping.Builder()
            .validateMethod(method)
            .validatePath(path)
            .withResponse(response)
            .build();
    return with(fixture);
  }

  public FixtureServer with(FixtureMapping fixture) {
    fixtures.add(fixture);
    return this;
  }

  @Override
  public void close() {
    server.stop(0);
  }

  public String getUrl() {
    return "http://" + server.getAddress().getHostName() + ":" + server.getAddress().getPort();
  }
}
