package com.databricks.sdk.client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Simplistic and short-lived HTTP server intended to handle one or two requests before shutting
 * down. Not intended to serve traffic to the Internet.
 */
class SimpleHttpServer implements Runnable {

  private final ServerSocket server;
  private final Handler handler;
  private volatile boolean running;
  private Thread thread;

  public interface Handler {
    void accept(BufferedReader in, PrintWriter out) throws IOException;
  }

  /**
   * <p>Constructor for SimpleHttpServer.</p>
   *
   * @param handler a {@link com.databricks.sdk.client.SimpleHttpServer.Handler} object
   * @throws java.io.IOException if any.
   */
  public SimpleHttpServer(Handler handler) throws IOException {
    this(0, handler);
  }

  /**
   * <p>Constructor for SimpleHttpServer.</p>
   *
   * @param port a int
   * @param handler a {@link com.databricks.sdk.client.SimpleHttpServer.Handler} object
   * @throws java.io.IOException if any.
   */
  public SimpleHttpServer(int port, Handler handler) throws IOException {
    this.handler = handler;
    server = new ServerSocket(port);
  }

  /**
   * <p>getUrl.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUrl() {
    return String.format("http://localhost:%d", server.getLocalPort());
  }

  /**
   * <p>accept.</p>
   *
   * @throws java.io.IOException if any.
   */
  public void accept() throws IOException {
    Socket clientSocket = server.accept();
    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
    handler.accept(in, out);
    out.flush();
    out.close();
  }

  /**
   * <p>start.</p>
   *
   * @throws java.lang.InterruptedException if any.
   */
  public void start() throws InterruptedException {
    running = true;
    thread = new Thread(this);
    thread.setDaemon(true);
    thread.setName(String.format("SimpleHttpServer<%s>", getUrl()));
    thread.start();
  }

  /**
   * <p>stop.</p>
   */
  public synchronized void stop() {
    running = false;
    thread.interrupt();
  }

  /** {@inheritDoc} */
  @Override
  public void run() {
    while (running) {
      try {
        accept();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

  /**
   * <p>query.</p>
   *
   * @param line a {@link java.lang.String} object
   * @return a {@link java.util.Map} object
   */
  public static Map<String, String> query(String line) {
    final String regex = "(\\\\?|&)(\\w+)=(.*?)(?:&|\\s|$)";
    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    final Matcher matcher = pattern.matcher(line);
    Map<String, String> query = new HashMap<>();
    while (matcher.find()) {
      try {
        String raw = matcher.group(3);
        String decoded = URLDecoder.decode(raw, "UTF-8");
        query.put(matcher.group(2), decoded);
      } catch (UnsupportedEncodingException e) {
        // noop
      }
    }
    return query;
  }

  /**
   * <p>main.</p>
   *
   * @param args an array of {@link java.lang.String} objects
   * @throws java.io.IOException if any.
   */
  public static void main(String[] args) throws IOException {
    SimpleHttpServer srv =
        new SimpleHttpServer(
            8001,
            (in, out) -> {
              String firstLine = in.readLine();
              Map<String, String> query = query(firstLine);
              out.println("HTTP/1.1 200 OK");
              out.println("Connection: close");
              out.println("Content-Type: text/plain");
              out.println();

              out.println(firstLine);
            });
    System.out.println(srv.getUrl());
    srv.running = true;
    srv.run();
  }
}
