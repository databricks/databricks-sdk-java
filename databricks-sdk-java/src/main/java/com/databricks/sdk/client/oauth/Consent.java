package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.DatabricksException;
import com.databricks.sdk.client.commons.CommonsHttpClient;
import com.databricks.sdk.client.http.HttpClient;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.io.IOUtils;

public class Consent implements Serializable {
  private static final Long serialVersionUID = -3832904096215095559L;

  public static class Builder {
    private HttpClient hc = new CommonsHttpClient(30);
    private URI authUrl;
    private String verifier;
    private String state;
    private URI tokenUrl;
    private URI redirectUrl;
    private String clientId;
    private String clientSecret;

    public Builder withHttpClient(HttpClient hc) {
      this.hc = hc;
      return this;
    }

    public Builder withAuthUrl(URI authUrl) {
      this.authUrl = authUrl;
      return this;
    }

    public Builder withVerifier(String verifier) {
      this.verifier = verifier;
      return this;
    }

    public Builder withState(String state) {
      this.state = state;
      return this;
    }

    public Builder withTokenUrl(URI tokenUrl) {
      this.tokenUrl = tokenUrl;
      return this;
    }

    public Builder withRedirectUrl(URI redirectUrl) {
      this.redirectUrl = redirectUrl;
      return this;
    }

    public Builder withClientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    public Builder withClientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
      return this;
    }

    public Consent build() {
      return new Consent(this);
    }
  }

  // Not serialized
  private transient HttpClient hc;
  private final URI authUrl;
  private final String verifier;
  private final String state;
  private final URI tokenUrl;
  private final URI redirectUrl;
  private final String clientId;
  private final String clientSecret;

  private Consent(Builder builder) {
    this.hc = Objects.requireNonNull(builder.hc);
    this.authUrl = Objects.requireNonNull(builder.authUrl);
    this.verifier = Objects.requireNonNull(builder.verifier);
    this.state = Objects.requireNonNull(builder.state);
    this.tokenUrl = Objects.requireNonNull(builder.tokenUrl);
    this.redirectUrl = Objects.requireNonNull(builder.redirectUrl);
    this.clientId = Objects.requireNonNull(builder.clientId);
    // This may be null for native apps or single-page apps.
    this.clientSecret = builder.clientSecret;
  }

  public Consent setHttpClient(HttpClient hc) {
    this.hc = hc;
    return this;
  }

  static class CallbackResponseHandler implements HttpHandler {
    // Protects params
    private final Object lock = new Object();
    private volatile Map<String, String> params;

    private void sendError(
        HttpExchange exchange, int statusCode, String message, String description)
        throws IOException {
      InputStream failureRespStream =
          getClass().getClassLoader().getResourceAsStream("oauth/failed_response.html.tmpl");
      String body =
          IOUtils.toString(Objects.requireNonNull(failureRespStream), StandardCharsets.UTF_8);
      Map<String, String> replacements = new HashMap<>();
      replacements.put("code", String.valueOf(statusCode));
      replacements.put("message", message);
      replacements.put("explain", description);
      for (Map.Entry<String, String> e : replacements.entrySet()) {
        body = body.replaceAll(e.getKey(), e.getValue());
      }

      Headers respHeaders = exchange.getResponseHeaders();
      respHeaders.set("Connection", "close");
      respHeaders.set("Content-Type", "text/html;charset=utf-8");
      exchange.sendResponseHeaders(200, body.length());

      OutputStream out = exchange.getResponseBody();
      out.write(body.getBytes(StandardCharsets.UTF_8));
      out.close();
    }

    private void sendSuccess(HttpExchange exchange) throws IOException {
      InputStream successRespStream =
          getClass().getClassLoader().getResourceAsStream("oauth/successful_response.html");
      String body =
          IOUtils.toString(Objects.requireNonNull(successRespStream), StandardCharsets.UTF_8);

      Headers respHeaders = exchange.getResponseHeaders();
      respHeaders.set("Content-Type", "text/html;charset=utf-8");
      exchange.sendResponseHeaders(200, body.length());

      OutputStream out = exchange.getResponseBody();
      out.write(body.getBytes(StandardCharsets.UTF_8));
      out.close();
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
      if (!exchange.getRequestMethod().equals("GET")) {
        sendError(
            exchange,
            400,
            "Unsupported method",
            "Unsupported method " + exchange.getRequestMethod() + "; only GET is supported");
        return;
      }

      String query = exchange.getRequestURI().getQuery();
      if (query == null || query.isEmpty()) {
        sendError(exchange, 400, "Missing Query", "Bad request syntax or unsupported method");
        return;
      }

      String decodedQueryString = URLDecoder.decode(query, StandardCharsets.UTF_8.name());
      synchronized (lock) {
        params = new HashMap<>();
        Arrays.stream(decodedQueryString.split("&"))
            .forEach(
                param -> {
                  String[] keyValue = param.split("=");
                  String key = keyValue[0];
                  String value = keyValue.length > 1 ? keyValue[1] : "";
                  params.put(key, value);
                });
        lock.notify();
      }
      sendSuccess(exchange);
    }

    public Map<String, String> getParams() {
      synchronized (lock) {
        if (params == null) {
          try {
            lock.wait();
          } catch (InterruptedException e) {
            throw new DatabricksException(
                "Interrupted while waiting for parameters: " + e.getMessage(), e);
          }
        }
        return params;
      }
    }
  }

  public RefreshableCredentials launchExternalBrowser() throws IOException {
    if (!Arrays.asList("localhost", "127.0.0.1").contains(redirectUrl.getHost())) {
      throw new IllegalArgumentException(
          "cannot listen on "
              + redirectUrl.getHost()
              + ", redirectUrl host must be one of: localhost, 127.0.0.1");
    }
    CallbackResponseHandler handler = new CallbackResponseHandler();
    HttpServer httpServer =
        HttpServer.create(new InetSocketAddress(redirectUrl.getHost(), redirectUrl.getPort()), 0);
    httpServer.createContext("/", handler);
    httpServer.start();
    System.out.println("Opening " + this.authUrl + " in a browser");
    Desktop.getDesktop().browse(this.authUrl);
    System.out.println("Waiting for redirect to " + redirectUrl);
    Map<String, String> params = handler.getParams();
    httpServer.stop(0);
    return exchangeCallbackParameters(params);
  }

  public RefreshableCredentials exchangeCallbackParameters(Map<String, String> query)
      throws IOException {
    if (query.containsKey("error")) {
      throw new DatabricksException(query.get("error") + ": " + query.get("error_description"));
    }
    if (!query.containsKey("code") || !query.containsKey("state")) {
      throw new DatabricksException("No code returned in callback");
    }
    return exchange(query.get("code"), query.get("state"));
  }

  public RefreshableCredentials exchange(String code, String state) throws IOException {
    if (!this.state.equals(state)) {
      throw new DatabricksException(
          "state mismatch: original state: " + this.state + "; retrieved state: " + state);
    }
    Map<String, String> params = new HashMap<>();
    params.put("grant_type", "authorization_code");
    params.put("code", code);
    params.put("code_verifier", this.verifier);
    params.put("redirect_uri", this.redirectUrl.toString());
    Map<String, String> headers = new HashMap<>();
    if (this.tokenUrl.toString().contains("microsoft")) {
      headers.put("Origin", this.redirectUrl.toString());
    }
    Token token =
        RefreshableTokenSource.retrieveToken(
            this.hc,
            this.clientId,
            this.clientSecret,
            this.tokenUrl,
            params,
            headers,
            AuthParameterPosition.BODY);
    return new RefreshableCredentials.Builder()
        .withHttpClient(this.hc)
        .withClientId(this.clientId)
        .withClientSecret(this.clientSecret)
        .withTokenUrl(this.tokenUrl)
        .withToken(token)
        .build();
  }
}
