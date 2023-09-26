package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FixtureServer implements Closeable {
  class FixtureMapping {
    private final String expectedRequest;
    private final String response;

    FixtureMapping(String expectedRequest, String response) {
      this.expectedRequest = expectedRequest;
      this.response = response;
    }

    public String getExpectedRequest() {
      return expectedRequest;
    }

    public String getResponse() {
      return response;
    }
  }
  private final SimpleHttpServer server;
  private final List<FixtureMapping> fixtures = new ArrayList<>();

  public FixtureServer() throws IOException {
    server = new SimpleHttpServer(this::handler);
    try {
      server.start();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  private void handler(BufferedReader in, PrintWriter out) {
    try {
      handlerInner(in, out);
    } catch (Exception e) {
      respondInternalServerError(out, e.getMessage());
    }
  }

  private void handlerInner(BufferedReader in, PrintWriter out) throws IOException {
    if (fixtures.isEmpty()) {
      respondInternalServerError(out, "No fixtures defined");
      return;
    }

    FixtureMapping response = fixtures.remove(0);
    int expectedBytes = response.getExpectedRequest().length();
    StringBuilder content = new StringBuilder();
    int bytesRead = 0;
    try {
      for (; bytesRead <  expectedBytes; bytesRead++) {
        int charRead = in.read();
        if (charRead == -1) {
          failDuringRead(out, "Unexpected EOF", response.getExpectedRequest(), content.toString());
          return;
        }
        content.append((char) charRead);
      }
    } catch (SocketTimeoutException e) {
      failDuringRead(out, "Read timed out", response.getExpectedRequest(), content.toString());
      return;
    }

    String contentString = content.toString();
    if (!contentString.equals(response.getExpectedRequest())) {
      respondBadRequest(out, "Expected: " + response.getExpectedRequest() + ", got: " + contentString);
      return;
    }

    respondSuccess(out, response.getResponse());
  }

  private void failDuringRead(PrintWriter out, String message, String expectedRequest, String content) {
    int expectedBytes = expectedRequest.length();
    int bytesRead = content.length();
    respondBadRequest(out, message + ". Requested bytes: " + expectedBytes + ", read: " + bytesRead + ", expected request: " + expectedRequest + ", content:\n" + content);
  }

  private void respondBadRequest(PrintWriter out, String body) {
    out.println("HTTP/1.1 400 Bad Request");
    out.println("Connection: close");
    out.println("Content-Type: text/plain");
    out.println();
    out.println(body);
  }

  private void respondInternalServerError(PrintWriter out, String body) {
    out.println("HTTP/1.1 500 Internal Server Error");
    out.println("Connection: close");
    out.println("Content-Type: text/plain");
    out.println();
    out.println(body);
  }

  private void respondSuccess(PrintWriter out, String body) {
    out.println("HTTP/1.1 200 OK");
    out.println("Connection: close");
    out.println("Content-Type: text/plain");
    out.println();
    out.println(body);
  }

  public FixtureServer with(String expectedRequest, String response) {
    fixtures.add(new FixtureMapping(expectedRequest, response));
    return this;
  }

  @Override
  public void close() throws IOException {
    server.stop();
  }

  public String getUrl() {
    return server.getUrl();
  }
}
