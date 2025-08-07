package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.core.http.HttpClient;
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
import java.util.Optional;
import java.time.Duration;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Consent provides a mechanism to retrieve an authorization code and exchange it for an OAuth token
 * using the Authorization Code + PKCE flow.
 *
 * <p>This class is typically instantiated using an instance of {@code OAuthClient}:
 *
 * <pre>{@code
 * OAuthClient client = ...;
 * Consent consent = client.initiateConsent();
 * }</pre>
 *
 * <p>Web applications or SPAs would redirect a user to the URL returned by {@code getAuthUrl()}
 * method and implement a callback handler which calls {@code exchangeCallbackParameters()} with the
 * query parameters from the callback to exchange the authorization code for OAuth credentials.
 *
 * <p>Native applications can call the {@code launchExternalBrowser()} method to open the user's
 * browser to navigate to the authorization page for the current application. A short-lived HTTP
 * server is launched to listen to the callback, and on success, the browser page is closed and the
 * authorization code is collected and exchanged for an OAuth token.
 */
public class Consent implements Serializable {
  private static final Long serialVersionUID = -3832904096215095559L;

  private transient HttpClient hc;
  private final String authUrl;
  private final String verifier;
  private final String state;
  private final String tokenUrl;
  private final String redirectUrl;
  private final String clientId;
  private final String clientSecret;
  private final Optional<Duration> browserTimeout;

  public static class Builder {
    private HttpClient hc = new CommonsHttpClient.Builder().withTimeoutSeconds(30).build();
    private String authUrl;
    private String verifier;
    private String state;
    private String tokenUrl;
    private String redirectUrl;
    private String clientId;
    private String clientSecret;
    private Optional<Duration> browserTimeout = Optional.empty();

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

    public Builder withBrowserTimeout(Optional<Duration> browserTimeout) {
      this.browserTimeout = browserTimeout;
      return this;
    }

    public Builder withBrowserTimeout(Duration browserTimeout) {
      return withBrowserTimeout(Optional.of(browserTimeout));
    }

    public Consent build() {
      return new Consent(this);
    }
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
    this.browserTimeout = builder.browserTimeout;
  }

  public Consent setHttpClient(HttpClient hc) {
    // Allow setting HttpClient on deserialization.
    this.hc = hc;
    return this;
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

  public Optional<Duration> getBrowserTimeout() {
    return browserTimeout;
  }

  /**
   * Launch a browser to collect an authorization code and exchange the code for an OAuth token.
   *
   * @return A {@code SessionCredentials} instance representing the retrieved OAuth token.
   * @throws IOException if the webserver cannot be started, or if the browser cannot be opened.
   */
  public SessionCredentials launchExternalBrowser() throws IOException {
    Map<String, String> params = getOAuthCallbackParameters();
    return exchangeCallbackParameters(params);
  }

  /**
   * Exchange callback parameters for OAuth credentials.
   *
   * @param query The callback parameters from the OAuth flow
   * @return A {@code SessionCredentials} instance representing the retrieved OAuth token.
   */
  public SessionCredentials exchangeCallbackParameters(Map<String, String> query) {
    validateCallbackParameters(query);
    Token token = exchange(query.get("code"), query.get("state"));
    return new SessionCredentials.Builder()
        .withHttpClient(this.hc)
        .withClientId(this.clientId)
        .withClientSecret(this.clientSecret)
        .withTokenUrl(this.tokenUrl)
        .withToken(token)
        .build();
  }

  /**
   * Launches an external browser to collect OAuth callback parameters and exchanges them for an
   * OAuth token.
   *
   * @return A {@code Token} instance containing the OAuth access token and related credentials
   * @throws IOException if the local HTTP server cannot be started, the browser cannot be opened,
   *     or there are network issues during the token exchange
   * @throws DatabricksException if the OAuth callback contains an error, missing required
   *     parameters, or if there's a state mismatch during the token exchange.
   */
  Token getTokenFromExternalBrowser() throws IOException {
    Map<String, String> params = getOAuthCallbackParameters();
    validateCallbackParameters(params);
    return exchange(params.get("code"), params.get("state"));
  }

  protected void desktopBrowser() throws IOException {
    Desktop.getDesktop().browse(URI.create(this.authUrl));
  }

  /**
   * Handles the OAuth callback by setting up a local HTTP server, launching the browser, and
   * collecting the callback parameters.
   *
   * @return A map containing the callback parameters from the OAuth flow.
   * @throws IOException if the webserver cannot be started, or if the browser cannot be opened.
   */
  private Map<String, String> getOAuthCallbackParameters() throws IOException {
    URL redirect = new URL(getRedirectUrl());
    if (!Arrays.asList("localhost", "127.0.0.1").contains(redirect.getHost())) {
      throw new IllegalArgumentException(
          "cannot listen on "
              + redirect.getHost()
              + ", redirectUrl host must be one of: localhost, 127.0.0.1");
    }

    CallbackResponseHandler handler = new CallbackResponseHandler(this.browserTimeout);
    HttpServer httpServer =
        HttpServer.create(new InetSocketAddress(redirect.getHost(), redirect.getPort()), 0);
    httpServer.createContext("/", handler);
    httpServer.start();
    desktopBrowser();
    Map<String, String> params = handler.getParams();
    httpServer.stop(0);
    return params;
  }

  /**
   * Validates the OAuth callback parameters to ensure they contain the required fields and no error
   * conditions.
   *
   * @param query The callback parameters to validate
   * @throws DatabricksException if validation fails due to error conditions or missing required
   *     parameters
   */
  private void validateCallbackParameters(Map<String, String> query) {
    if (query.containsKey("error")) {
      throw new DatabricksException(query.get("error") + ": " + query.get("error_description"));
    }
    if (!query.containsKey("code") || !query.containsKey("state")) {
      throw new DatabricksException("No code returned in callback");
    }
  }

  /**
   * Exchange authorization code for OAuth token.
   *
   * @param code The authorization code from the OAuth callback
   * @param state The state parameter from the OAuth callback
   * @return A {@code Token} instance representing the OAuth token
   */
  private Token exchange(String code, String state) {
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
        TokenEndpointClient.retrieveToken(
            this.hc,
            this.clientId,
            this.clientSecret,
            this.tokenUrl,
            params,
            headers,
            AuthParameterPosition.BODY);
    return token;
  }

  static class CallbackResponseHandler implements HttpHandler {
    private final Logger LOG = LoggerFactory.getLogger(getClass().getName());
    // Protects params
    private final Object lock = new Object();
    private volatile Map<String, String> params;
    private final Optional<Duration> timeout;

    public CallbackResponseHandler(Optional<Duration> timeout) {
      this.timeout = timeout;
    }

    @Override
    public void handle(HttpExchange exchange) {
      try {
        handleInner(exchange);
      } catch (IOException e) {
        LOG.error("Unable to handle callback request", e);
      }
    }

    public void handleInner(HttpExchange exchange) throws IOException {
      if (!"GET".equals(exchange.getRequestMethod())) {
        sendError(
            exchange,
            400,
            "Unsupported method",
            "Unsupported method " + exchange.getRequestMethod() + "; only GET is supported");
        return;
      }

      String query = exchange.getRequestURI().getQuery();
      if (query == null || query.isEmpty()) {
        sendError(exchange, 400, "Missing Query", "No query received for the current request");
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
    }

    public Map<String, String> getParams() {
      synchronized (lock) {
        if (params == null) {
          try {
            if (timeout.isPresent()) {
              Duration t = timeout.get();
              lock.wait(t.toMillis());
              if (params == null) {
                throw new DatabricksException("OAuth browser authentication timed out after " + t.getSeconds() + " seconds");
              }
            } else {
              lock.wait();
            }
          } catch (InterruptedException e) {
            throw new DatabricksException(
                "Interrupted while waiting for parameters: " + e.getMessage(), e);
          }
        }
        return params;
      }
    }
  }
}
