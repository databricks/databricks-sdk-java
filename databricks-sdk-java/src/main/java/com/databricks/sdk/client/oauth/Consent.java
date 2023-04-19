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
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Consent implements Serializable {
  private static final Long serialVersionUID = -3832904096215095559L;
  private final Logger LOG = LoggerFactory.getLogger(getClass().getName());

  // Not serialized
  private transient HttpClient hc;
  private final String authUrl;
  private final String verifier;
  private final String state;
  private final String tokenUrl;
  private final String redirectUrl;
  private final String clientId;
  private final String clientSecret;

  public static class Builder {
    private HttpClient hc = new CommonsHttpClient(30);
    private String authUrl;
    private String verifier;
    private String state;
    private String tokenUrl;
    private String redirectUrl;
    private String clientId;
    private String clientSecret;

    public Builder withHttpClient(HttpClient hc) {
      this.hc = hc;
      return this;
    }

    public Builder withAuthUrl(String authUrl) {
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

    public Builder withTokenUrl(String tokenUrl) {
      this.tokenUrl = tokenUrl;
      return this;
    }

    public Builder withRedirectUrl(String redirectUrl) {
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


  public String getAuthUrl() {
    return authUrl;
  }

  public String getVerifier() {
    return verifier;
  }

  public String getState() {
    return state;
  }

  public String getTokenUrl() {
    return tokenUrl;
  }

  public String getRedirectUrl() {
    return redirectUrl;
  }

  public String getClientId() {
    return clientId;
  }

  public String getClientSecret() {
    return clientSecret;
  }

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

  static class CallbackResponseHandler implements HttpHandler {
    private final Logger LOG = LoggerFactory.getLogger(getClass().getName());
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
      replacements.put("{{code}}", String.valueOf(statusCode));
      replacements.put("{{message}}", message);
      replacements.put("{{explain}}", description);
      for (Map.Entry<String, String> e : replacements.entrySet()) {
        body = body.replaceAll(e.getKey(), e.getValue());
      }

      Headers respHeaders = exchange.getResponseHeaders();
      respHeaders.set("Connection", "close");
      respHeaders.set("Content-Type", "text/html;charset=utf-8");
      exchange.sendResponseHeaders(200, body.length());

      OutputStream out = exchange.getResponseBody();
      out.write(body.getBytes(StandardCharsets.UTF_8));
      exchange.close();
    }

    private void sendSuccess(HttpExchange exchange) throws IOException {
      try {
        InputStream successRespStream =
            getClass().getClassLoader().getResourceAsStream("oauth/successful_response.html");
        String body =
            IOUtils.toString(Objects.requireNonNull(successRespStream), StandardCharsets.UTF_8);

        Headers respHeaders = exchange.getResponseHeaders();
        respHeaders.set("Content-Type", "text/html;charset=utf-8");
        exchange.sendResponseHeaders(200, body.length());

        OutputStream out = exchange.getResponseBody();
        out.write(body.getBytes(StandardCharsets.UTF_8));
        exchange.close();
      } catch (IOException e) {
        LOG.error("Failed to write success response", e);
      }
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
      Map<String, String> theseParams = new HashMap<>();
      Arrays.stream(decodedQueryString.split("&"))
          .forEach(
              param -> {
                String[] keyValue = param.split("=");
                String key = keyValue[0];
                String value = keyValue.length > 1 ? keyValue[1] : "";
                theseParams.put(key, value);
              });

      sendSuccess(exchange);
      synchronized (lock) {
        params = theseParams;
        lock.notify();
      }
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

  public RefreshableCredentials launchExternalBrowser() throws IOException, URISyntaxException {
    URL redirect = new URL(getRedirectUrl());
    if (!Arrays.asList("localhost", "127.0.0.1").contains(redirect.getHost())) {
      throw new IllegalArgumentException(
          "cannot listen on "
              + redirect.getHost()
              + ", redirectUrl host must be one of: localhost, 127.0.0.1");
    }
    CallbackResponseHandler handler = new CallbackResponseHandler();
    HttpServer httpServer =
        HttpServer.create(new InetSocketAddress(redirect.getHost(), redirect.getPort()), 0);
    httpServer.createContext("/", handler);
    httpServer.start();
    System.out.println("Opening " + this.authUrl + " in a browser");
    Desktop.getDesktop().browse(URI.create(this.authUrl));
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
    params.put("redirect_uri", this.redirectUrl);
    Map<String, String> headers = new HashMap<>();
    if (this.tokenUrl.contains("microsoft")) {
      headers.put("Origin", this.redirectUrl);
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
