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
  // Default duration before expiry to consider a token as 'stale'. This value is chosen to cover
  // the maximum monthly downtime allowed by a 99.99% uptime SLA (~4.38 minutes).
  private static final Duration DEFAULT_STALE_DURATION = Duration.ofMinutes(5);
  // The maximum stale duration that can be achieved before expiry to consider a token as 'stale'
  // when using the dynamic stale duration method. This value is chosen to cover the maximum
  // monthly downtime allowed by a 99.99% uptime SLA (~4.38 minutes) while increasing the likelihood
  // that the token is refreshed asynchronously if the auth server is down.
  private static final Duration MAX_STALE_DURATION = Duration.ofMinutes(20);
  // Delay before another async refresh may be attempted after an async refresh failure.
  private static final Duration ASYNC_REFRESH_RETRY_BACKOFF = Duration.ofMinutes(1);
  // Default additional buffer before expiry to consider a token as expired.
  // This is 40 seconds by default since Azure Databricks rejects tokens that are within 30 seconds
  // of expiry.
  private static final Duration DEFAULT_EXPIRY_BUFFER = Duration.ofSeconds(40);

  // Underlying token source used to fetch replacement tokens.
  private final TokenSource tokenSource;
  // Whether asynchronous refresh is enabled.
  private boolean asyncDisabled = false;
  // The legacy duration before expiry to consider a token as 'stale'.
  private final Duration staticStaleDuration;
  // Whether to use the dynamic stale duration computation or defer to the legacy duration.
  private final boolean useLegacyStaleDuration;
  // The earliest time at which the cached token should be considered stale.
  private volatile Instant staleAfter;
  // Additional buffer before expiry to consider a token as expired.
  private final Duration expiryBuffer;
  // Clock supplier for current time.
  private final ClockSupplier clockSupplier;

  // The current OAuth token. May be null if not yet fetched.
  protected volatile Token token;
  // Whether a refresh is currently in progress (for async refresh).
  private boolean refreshInProgress = false;

  private CachedTokenSource(Builder builder) {
    this.tokenSource = builder.tokenSource;
    this.asyncDisabled = builder.asyncDisabled;
    this.staticStaleDuration = builder.staleDuration;
    this.useLegacyStaleDuration = builder.useLegacyStaleDuration;
    this.expiryBuffer = builder.expiryBuffer;
    this.clockSupplier = builder.clockSupplier;

    this.updateToken(builder.token);
  }

  /**
   * Builder for creating instances of {@link CachedTokenSource}.
   *
   * <p>This builder allows configuration of various aspects of token caching behavior, including
   * asynchronous refresh, timing parameters, and initial token state.
   */
  public static class Builder {
    private final TokenSource tokenSource;
    private boolean asyncDisabled = false;
    private Duration staleDuration = DEFAULT_STALE_DURATION;
    private boolean useLegacyStaleDuration = false;
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
     * @param asyncDisabled True to disable asynchronous refresh, false to enable.
     * @return This builder instance for method chaining.
     */
    public Builder setAsyncDisabled(boolean asyncDisabled) {
      this.asyncDisabled = asyncDisabled;
      return this;
    }

    /**
     * Sets the duration before token expiry at which the token is considered stale.
     *
     * <p>When asynchronous refresh is enabled, tokens that are stale but not yet expired will
     * trigger a background refresh while continuing to serve the current token. Calling this method
     * opts into the legacy fixed stale-duration behavior instead of the default dynamic stale
     * computation, preserving backward compatibility for callers that already provide a custom
     * stale duration.
     *
     * @param staleDuration The duration before expiry to consider a token stale. Must be greater
     *     than the expiry buffer duration.
     * @return This builder instance for method chaining.
     */
    public Builder setStaleDuration(Duration staleDuration) {
      this.staleDuration = staleDuration;
      this.useLegacyStaleDuration = true;
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
   * Replaces the cached token and recomputes the time after which it should be treated as stale.
   *
   * <p>Legacy mode uses the configured fixed stale duration. Dynamic mode derives the stale window
   * from the token's remaining TTL and caps it at {@link #MAX_STALE_DURATION}. The stale threshold
   * is written before the volatile token write so readers that observe the new token also observe
   * the matching {@code staleAfter} value.
   *
   * @param t The token to cache. May be null.
   */
  private void updateToken(Token t) {
    if (t == null || t.getExpiry() == null) {
      this.staleAfter = null;
      this.token = t;
      return;
    }

    if (this.useLegacyStaleDuration) {
      this.staleAfter = t.getExpiry().minus(staticStaleDuration);
    } else {
      Duration ttl = Duration.between(Instant.now(clockSupplier.getClock()), t.getExpiry());
      Duration staleDuration = ttl.dividedBy(2);
      if (staleDuration.compareTo(MAX_STALE_DURATION) > 0) {
        staleDuration = MAX_STALE_DURATION;
      }
      if (staleDuration.compareTo(Duration.ZERO) <= 0) {
        staleDuration = Duration.ZERO;
      }

      this.staleAfter = t.getExpiry().minus(staleDuration);
    }

    // Publish the token after staleAfter so readers that observe the new token also observe the
    // stale threshold computed for that token. Note: handleFailedAsyncRefresh writes staleAfter
    // without a subsequent volatile token write, so a concurrent reader may briefly see a stale
    // staleAfter value; the only consequence is one extra async trigger, which is harmless.
    this.token = t;
  }

  /**
   * Delays the next async refresh attempt after an async refresh failure.
   *
   * <p>The cached token remains usable until it becomes expired. Moving {@code staleAfter} into the
   * future prevents callers from immediately retrying async refresh on every stale read while the
   * auth service is unhealthy.
   */
  private void handleFailedAsyncRefresh() {
    if (this.staleAfter != null) {
      Instant now = Instant.now(clockSupplier.getClock());
      this.staleAfter = now.plus(ASYNC_REFRESH_RETRY_BACKOFF);
    }
  }

  /**
   * Returns {@code true} when the currently cached token has a later expiry than {@code candidate},
   * meaning the candidate should be discarded. This prevents an async refresh that was started
   * before a blocking refresh from overwriting the newer token obtained by the blocking path.
   */
  private boolean cachedTokenIsNewer(Token candidate) {
    return token != null
        && token.getExpiry() != null
        && candidate.getExpiry() != null
        && token.getExpiry().isAfter(candidate.getExpiry());
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
    if (asyncDisabled) {
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
    if (t.getExpiry() == null) {
      return TokenState.FRESH; // Tokens with no expiry are considered permanent.
    }

    Instant now = Instant.now(clockSupplier.getClock());
    if (now.isAfter(t.getExpiry().minus(expiryBuffer))) {
      return TokenState.EXPIRED;
    }
    if (now.isAfter(staleAfter)) {
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
      Token newToken;
      try {
        newToken = tokenSource.getToken();
      } catch (Exception e) {
        logger.error("Failed to refresh token synchronously", e);
        throw e;
      }

      updateToken(newToken);
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
    // Re-check inside the synchronized block: another thread may have updated the token.
    // Only STALE triggers async refresh; EXPIRED tokens are handled by getTokenBlocking, so
    // an async attempt is unnecessary and would race with the blocking path.
    if (refreshInProgress || getTokenState(token) != TokenState.STALE) {
      return;
    }

    refreshInProgress = true;
    CompletableFuture.runAsync(
        () -> {
          try {
            Token newToken = tokenSource.getToken();
            synchronized (this) {
              if (newToken != null && !cachedTokenIsNewer(newToken)) {
                updateToken(newToken);
              }
            }
          } catch (Exception e) {
            synchronized (this) {
              handleFailedAsyncRefresh();
              logger.error("Asynchronous token refresh failed", e);
            }
          } finally {
            synchronized (this) {
              refreshInProgress = false;
            }
          }
        });
  }
}
