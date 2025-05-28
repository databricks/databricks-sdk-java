package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.FormRequest;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import org.apache.http.HttpHeaders;

/**
 * An OAuth TokenSource which can be refreshed.
 *
 * <p>Calls to getToken() will first check if the token is still valid (currently defined by having
 * at least 10 seconds until expiry). If not, refresh() is called first to refresh the token.
 */
public abstract class RefreshableTokenSource implements TokenSource {

  private enum TokenState {
    FRESH, // The token is valid.
    STALE, // The token is valid but will expire soon.
    EXPIRED // The token has expired and cannot be used without refreshing.
  }

  private static final Duration DEFAULT_STALE_DURATION = Duration.ofMinutes(3);

  protected Token token;
  private boolean asyncEnabled = false;
  private Duration staleDuration = DEFAULT_STALE_DURATION;
  private boolean refreshInProgress = false;
  private boolean lastRefreshSucceeded = true;

  public RefreshableTokenSource() {}

  public RefreshableTokenSource(Token token) {
    this.token = token;
  }

  public RefreshableTokenSource enableAsyncRefresh(boolean enabled) {
    this.asyncEnabled = enabled;
    return this;
  }

  /**
   * Helper method implementing OAuth token refresh.
   *
   * @param clientId The client ID to authenticate with.
   * @param clientSecret The client secret to authenticate with.
   * @param tokenUrl The authorization URL for fetching tokens.
   * @param params Additional request parameters.
   * @param headers Additional headers.
   * @param position The position of the authentication parameters in the request.
   * @return The newly fetched Token.
   */
  protected static Token retrieveToken(
      HttpClient hc,
      String clientId,
      String clientSecret,
      String tokenUrl,
      Map<String, String> params,
      Map<String, String> headers,
      AuthParameterPosition position) {
    switch (position) {
      case BODY:
        if (clientId != null) {
          params.put("client_id", clientId);
        }
        if (clientSecret != null) {
          params.put("client_secret", clientSecret);
        }
        break;
      case HEADER:
        String authHeaderValue =
            "Basic "
                + Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes());
        headers.put(HttpHeaders.AUTHORIZATION, authHeaderValue);
        break;
    }
    headers.put("Content-Type", "application/x-www-form-urlencoded");
    Request req = new Request("POST", tokenUrl, FormRequest.wrapValuesInList(params));
    req.withHeaders(headers);
    try {
      ApiClient apiClient = new ApiClient.Builder().withHttpClient(hc).build();
      OAuthResponse resp = apiClient.execute(req, OAuthResponse.class);
      if (resp.getErrorCode() != null) {
        throw new IllegalArgumentException(resp.getErrorCode() + ": " + resp.getErrorSummary());
      }
      LocalDateTime expiry = LocalDateTime.now().plus(resp.getExpiresIn(), ChronoUnit.SECONDS);
      return new Token(resp.getAccessToken(), resp.getTokenType(), resp.getRefreshToken(), expiry);
    } catch (Exception e) {
      throw new DatabricksException("Failed to refresh credentials: " + e.getMessage(), e);
    }
  }

  protected abstract Token refresh();

  public synchronized Token getToken() {
    if (!asyncEnabled) {
      return getTokenBlocking();
    }
    return getTokenAsync();
  }

  protected TokenState getTokenState() {
    if (token == null) {
      return TokenState.EXPIRED;
    }
    Duration lifeTime = token.getLifetime();
    if (lifeTime.compareTo(Duration.ZERO) <= 0) {
      return TokenState.EXPIRED;
    }
    if (lifeTime.compareTo(staleDuration) <= 0) {
      return TokenState.STALE;
    }
    return TokenState.FRESH;
  }

  protected synchronized Token getTokenBlocking() {
    refreshInProgress = false;
    TokenState state = getTokenState();
    if (state != TokenState.EXPIRED) {
      return token;
    }
    try {
      Token newToken = refresh();
      token = newToken;
      return newToken;
    } catch (Exception e) {
      lastRefreshSucceeded = false;
      throw e;
    }
  }

  protected Token getTokenAsync() {
    TokenState state;
    Token currentToken;
    synchronized (this) {
      state = getTokenState();
      currentToken = token;
    }
    if (state == TokenState.FRESH) {
      return currentToken;
    }
    if (state == TokenState.STALE) {
      triggerAsyncRefresh();
      return token;
    } else {
      return getTokenBlocking();
    }
  }

  protected synchronized void triggerAsyncRefresh() {
    if (!refreshInProgress && lastRefreshSucceeded) {
      refreshInProgress = true;
      CompletableFuture.runAsync(
          () -> {
            try {
              Token newToken = refresh();
              synchronized (this) {
                token = newToken;
                lastRefreshSucceeded = true;
                refreshInProgress = false;
              }
            } catch (Exception e) {
              synchronized (this) {
                lastRefreshSucceeded = false;
                refreshInProgress = false;
              }
            }
          });
    }
  }
}
