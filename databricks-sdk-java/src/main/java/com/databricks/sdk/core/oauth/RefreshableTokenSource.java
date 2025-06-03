package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.FormRequest;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.utils.ClockSupplier;
import com.databricks.sdk.core.utils.SystemClockSupplier;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import org.apache.http.HttpHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An OAuth TokenSource which can be refreshed.
 *
 * <p>This class supports both synchronous and asynchronous token refresh. When async is enabled,
 * stale tokens will trigger a background refresh, while expired tokens will block until a new token
 * is fetched.
 */
public abstract class RefreshableTokenSource implements TokenSource {

  /**
   * Enum representing the state of the token. FRESH: Token is valid and not close to expiry. STALE:
   * Token is valid but will expire soon - an async refresh will be triggered if enabled. EXPIRED:
   * Token has expired and must be refreshed using a blocking call.
   */
  private enum TokenState {
    FRESH,
    STALE,
    EXPIRED
  }

  private static final Logger logger = LoggerFactory.getLogger(RefreshableTokenSource.class);
  // Default duration before expiry to consider a token as 'stale'.
  private static final Duration DEFAULT_STALE_DURATION = Duration.ofMinutes(3);

  // The current OAuth token. May be null if not yet fetched.
  protected volatile Token token;
  // Whether asynchronous refresh is enabled.
  private boolean asyncEnabled = false;
  // Duration before expiry to consider a token as 'stale'.
  private Duration staleDuration = DEFAULT_STALE_DURATION;
  // Additional buffer before expiry to consider a token as expired.
  private Duration expiryBuffer = Duration.ofSeconds(40);
  // Whether a refresh is currently in progress (for async refresh).
  private boolean refreshInProgress = false;
  // Whether the last refresh attempt succeeded.
  private boolean lastRefreshSucceeded = true;
  // Clock supplier for current time, for testing purposes.
  private ClockSupplier clockSupplier = new SystemClockSupplier();

  /** Constructs a new {@code RefreshableTokenSource} with no initial token. */
  public RefreshableTokenSource() {}

  /**
   * Constructor with initial token.
   *
   * @param token The initial token to use.
   */
  public RefreshableTokenSource(Token token) {
    this.token = token;
  }

  /**
   * Set the clock supplier for current time.
   *
   * <p><b>Experimental:</b> This method may change or be removed in future releases.
   *
   * @param clockSupplier The clock supplier to use.
   * @return this instance for chaining
   */
  public RefreshableTokenSource withClockSupplier(ClockSupplier clockSupplier) {
    this.clockSupplier = clockSupplier;
    return this;
  }

  /**
   * Enable or disable asynchronous token refresh.
   *
   * <p><b>Experimental:</b> This method may change or be removed in future releases.
   *
   * @param enabled true to enable async refresh, false to disable
   * @return this instance for chaining
   */
  public RefreshableTokenSource withAsyncRefresh(boolean enabled) {
    this.asyncEnabled = enabled;
    return this;
  }

  /**
   * Set the expiry buffer. If the token's lifetime is less than this buffer, it is considered
   * expired.
   *
   * <p><b>Experimental:</b> This method may change or be removed in future releases.
   *
   * @param buffer the expiry buffer duration
   * @return this instance for chaining
   */
  public RefreshableTokenSource withExpiryBuffer(Duration buffer) {
    this.expiryBuffer = buffer;
    return this;
  }

  /**
   * Refresh the OAuth token. Subclasses must implement this to define how the token is refreshed.
   *
   * <p>This method may throw an exception if the token cannot be refreshed. The specific exception
   * type depends on the implementation.
   *
   * @return The newly refreshed Token.
   */
  protected abstract Token refresh();

  /**
   * Gets the current token, refreshing if necessary. If async refresh is enabled, may return a
   * stale token while a refresh is in progress.
   *
   * <p>This method may throw an exception if the token cannot be refreshed, depending on the
   * implementation of {@link #refresh()}.
   *
   * @return The current valid token
   */
  public Token getToken() {
    if (!asyncEnabled) {
      return getTokenBlocking();
    }
    return getTokenAsync();
  }

  /**
   * Determine the state of the current token (fresh, stale, or expired).
   *
   * @return The token state
   */
  protected TokenState getTokenState(Token t) {
    if (t == null) {
      return TokenState.EXPIRED;
    }
    Duration lifeTime =
        Duration.between(LocalDateTime.now(clockSupplier.getClock()), t.getExpiry());
    if (lifeTime.compareTo(expiryBuffer) <= 0) {
      return TokenState.EXPIRED;
    }
    if (lifeTime.compareTo(staleDuration) <= 0) {
      return TokenState.STALE;
    }
    return TokenState.FRESH;
  }

  /**
   * Get the current token, blocking to refresh if expired.
   *
   * <p>This method may throw an exception if the token cannot be refreshed, depending on the
   * implementation of {@link #refresh()}.
   *
   * @return The current valid token
   */
  protected Token getTokenBlocking() {
    // Use double-checked locking to minimize synchronization overhead on reads:
    // 1. Check if the token is expired without locking.
    // 2. If expired, synchronize and check again (another thread may have refreshed it).
    // 3. If still expired, perform the refresh.
    if (getTokenState(token) != TokenState.EXPIRED) {
      return token;
    }
    synchronized (this) {
      if (getTokenState(token) != TokenState.EXPIRED) {
        return token;
      }
      lastRefreshSucceeded = false;
      try {
        token = refresh();
      } catch (Exception e) {
        logger.error("Failed to refresh token synchronously", e);
        throw e;
      }
      lastRefreshSucceeded = true;
      return token;
    }
  }

  /**
   * Get the current token, possibly triggering an async refresh if stale. If the token is expired,
   * blocks to refresh.
   *
   * <p>This method may throw an exception if the token cannot be refreshed, depending on the
   * implementation of {@link #refresh()}.
   *
   * @return The current valid or stale token
   */
  protected Token getTokenAsync() {
    Token currentToken = token;

    switch (getTokenState(currentToken)) {
      case FRESH:
        return currentToken;
      case STALE:
        triggerAsyncRefresh();
        return currentToken;
      case EXPIRED:
        return getTokenBlocking();
      default:
        throw new IllegalStateException("Invalid token state.");
    }
  }

  /**
   * Trigger an asynchronous refresh of the token if not already in progress and last refresh
   * succeeded.
   */
  protected synchronized void triggerAsyncRefresh() {
    if (!refreshInProgress && lastRefreshSucceeded) {
      refreshInProgress = true;
      CompletableFuture.runAsync(
          () -> {
            try {
              // Attempt to refresh the token in the background
              Token newToken = refresh();
              synchronized (this) {
                token = newToken;
                refreshInProgress = false;
              }
            } catch (Exception e) {
              synchronized (this) {
                lastRefreshSucceeded = false;
                refreshInProgress = false;
                logger.error("Async token refresh failed", e);
              }
            }
          });
    }
  }

  /**
   * Helper method implementing OAuth token refresh.
   *
   * @param hc The HTTP client to use for the request.
   * @param clientId The client ID to authenticate with.
   * @param clientSecret The client secret to authenticate with.
   * @param tokenUrl The authorization URL for fetching tokens.
   * @param params Additional request parameters.
   * @param headers Additional headers.
   * @param position The position of the authentication parameters in the request.
   * @return The newly fetched Token.
   * @throws DatabricksException if the refresh fails
   * @throws IllegalArgumentException if the OAuth response contains an error
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
}
