package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.utils.ClockSupplier;
import com.databricks.sdk.core.utils.UtcClockSupplier;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An OAuth TokenSource which can be refreshed.
 *
 * <p>This class supports both synchronous and asynchronous token refresh. When async is enabled,
 * stale tokens will trigger a background refresh, while expired tokens will block until a new token
 * is fetched.
 */
public class CachedTokenSource implements TokenSource {

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

  private static final Logger logger = LoggerFactory.getLogger(CachedTokenSource.class);
  // Default duration before expiry to consider a token as 'stale'.
  private static final Duration DEFAULT_STALE_DURATION = Duration.ofMinutes(3);
  // Default additional buffer before expiry to consider a token as expired.
  // This is 40 seconds by default since Azure Databricks rejects tokens that are within 30 seconds
  // of expiry.
  private static final Duration DEFAULT_EXPIRY_BUFFER = Duration.ofSeconds(40);

  // The token source to use for refreshing the token.
  private final TokenSource tokenSource;
  // Whether asynchronous refresh is enabled.
  private boolean asyncEnabled =
      Boolean.parseBoolean(System.getenv("DATABRICKS_ENABLE_EXPERIMENTAL_ASYNC_TOKEN_REFRESH"));
  // Duration before expiry to consider a token as 'stale'.
  private final Duration staleDuration;
  // Additional buffer before expiry to consider a token as expired.
  private final Duration expiryBuffer;
  // Clock supplier for current time.
  private final ClockSupplier clockSupplier;

  // The current OAuth token. May be null if not yet fetched.
  private volatile Token token;
  // Whether a refresh is currently in progress (for async refresh).
  private boolean refreshInProgress = false;
  // Whether the last refresh attempt succeeded.
  private boolean lastRefreshSucceeded = true;

  private CachedTokenSource(Builder builder) {
    this.tokenSource = builder.tokenSource;
    this.asyncEnabled = builder.asyncEnabled;
    this.staleDuration = builder.staleDuration;
    this.expiryBuffer = builder.expiryBuffer;
    this.clockSupplier = builder.clockSupplier;
    this.token = builder.token;
  }

  /**
   * Builder for creating instances of {@link CachedTokenSource}.
   *
   * <p>This builder allows configuration of various aspects of token caching behavior, including
   * asynchronous refresh, timing parameters, and initial token state.
   */
  public static class Builder {
    private final TokenSource tokenSource;
    private boolean asyncEnabled = false;
    private Duration staleDuration = DEFAULT_STALE_DURATION;
    private Duration expiryBuffer = DEFAULT_EXPIRY_BUFFER;
    private ClockSupplier clockSupplier = new UtcClockSupplier();
    private Token token;

    /**
     * Creates a new builder with the specified token source.
     *
     * @param tokenSource The underlying token source to use for refreshing tokens.
     * @throws NullPointerException If the token source is null.
     */
    public Builder(TokenSource tokenSource) {
      this.tokenSource = Objects.requireNonNull(tokenSource);
    }

    /**
     * Sets an initial token to use in the cache.
     *
     * <p>If provided, this token will be used immediately without requiring an initial refresh from
     * the underlying token source.
     *
     * @param token The initial token to cache.
     * @return This builder instance for method chaining.
     */
    public Builder setToken(Token token) {
      this.token = token;
      return this;
    }

    /**
     * Enables or disables asynchronous token refresh.
     *
     * <p>When enabled, stale tokens will trigger a background refresh while continuing to serve the
     * current token. When disabled, all refreshes are performed synchronously and will block the
     * calling thread.
     *
     * @param asyncEnabled True to enable asynchronous refresh, false to disable.
     * @return This builder instance for method chaining.
     */
    public Builder setAsyncEnabled(boolean asyncEnabled) {
      this.asyncEnabled = asyncEnabled;
      return this;
    }

    /**
     * Sets the duration before token expiry at which the token is considered stale.
     *
     * <p>When asynchronous refresh is enabled, tokens that are stale but not yet expired will
     * trigger a background refresh while continuing to serve the current token.
     *
     * @param staleDuration The duration before expiry to consider a token stale. Must be greater
     *     than the expiry buffer duration.
     * @return This builder instance for method chaining.
     */
    public Builder setStaleDuration(Duration staleDuration) {
      this.staleDuration = staleDuration;
      return this;
    }

    /**
     * Sets the buffer duration before token expiry at which the token is considered expired.
     *
     * <p>Tokens within this buffer of their expiry time will be considered expired and require
     * synchronous refresh.
     *
     * @param expiryBuffer The buffer duration before expiry to consider a token expired. Must be
     *     less than the stale duration.
     * @return This builder instance for method chaining.
     */
    public Builder setExpiryBuffer(Duration expiryBuffer) {
      this.expiryBuffer = expiryBuffer;
      return this;
    }

    /**
     * Sets the clock supplier to use for time-based operations.
     *
     * <p>This is primarily useful for testing scenarios where you need to control the current time.
     * In production, the default UTC clock supplier should be used.
     *
     * @param clockSupplier The clock supplier to use for determining current time.
     * @return This builder instance for method chaining.
     */
    public Builder setClockSupplier(ClockSupplier clockSupplier) {
      this.clockSupplier = clockSupplier;
      return this;
    }

    /**
     * Builds and returns a new {@link CachedTokenSource} instance with the configured parameters.
     *
     * @return A new CachedTokenSource instance.
     */
    public CachedTokenSource build() {
      return new CachedTokenSource(this);
    }
  }

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
    if (asyncEnabled) {
      return getTokenAsync();
    }
    return getTokenBlocking();
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
    Duration lifeTime = Duration.between(Instant.now(clockSupplier.getClock()), t.getExpiry());
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
        token = tokenSource.getToken();
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
  private synchronized void triggerAsyncRefresh() {
    // Check token state again inside the synchronized block to avoid triggering a refresh if
    // another thread updated the token in the meantime.
    if (!refreshInProgress && lastRefreshSucceeded && getTokenState(token) != TokenState.FRESH) {
      refreshInProgress = true;
      CompletableFuture.runAsync(
          () -> {
            try {
              // Attempt to refresh the token in the background.
              Token newToken = tokenSource.getToken();
              synchronized (this) {
                token = newToken;
                refreshInProgress = false;
              }
            } catch (Exception e) {
              synchronized (this) {
                lastRefreshSucceeded = false;
                refreshInProgress = false;
                logger.error("Asynchronous token refresh failed", e);
              }
            }
          });
    }
  }
}
