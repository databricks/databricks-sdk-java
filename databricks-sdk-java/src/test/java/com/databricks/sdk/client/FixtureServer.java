package com.databricks.sdk.client;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FixtureServer implements Closeable {
  private final SimpleHttpServer server;
  private final Map<String, String> fixtures = new HashMap<>();

  public FixtureServer() throws IOException {
    server =
        new SimpleHttpServer(
            (in, out) -> {
              String line = in.readLine();
              String[] split = line.split("\\s+");

              String key = String.format("%s %s", split[0], split[1]);
              String response = fixtures.get(key);
              if (response == null) {
                fail(String.format("Cannot find %s fixture", key));
              }

              out.println("HTTP/1.1 200 OK");
              out.println("Connection: close");
              out.println("Content-Type: text/plain");
              out.println();
              out.println(response);
            });
    try {
      server.start();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public FixtureServer with(String request, String body) {
    fixtures.put(request, body);
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
