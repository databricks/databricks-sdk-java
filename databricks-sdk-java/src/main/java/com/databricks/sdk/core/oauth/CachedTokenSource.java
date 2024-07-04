package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.utils.ClockSupplier;
import com.databricks.sdk.core.utils.SystemClockSupplier;
import java.time.LocalDateTime;

/**
 * A {@link TokenSource} that wraps another {@link TokenSource} to only request a new {@link Token}
 * when the last one is invalid.
 */
public class CachedTokenSource implements TokenSource {

  private final ClockSupplier clockSupplier;
  private final TokenSource tokenSource;
  private Token token;

  /**
   * Constructs a new {@code CachedTokenSource} that wraps the provided {@link TokenSource} and uses
   * a {@code SystemClockSupplier} to verify the tokens' validity.
   *
   * @param tokenSource the underlying token source to wrap
   */
  public CachedTokenSource(TokenSource tokenSource) {
    this(new SystemClockSupplier(), tokenSource);
  }

  /**
   * Constructs a new {@code CachedTokenSource} that wraps the provided {@link TokenSource}.
   *
   * @param clockSupplier the clock supplier to check token validity
   * @param tokenSource the underlying token source to wrap
   */
  public CachedTokenSource(ClockSupplier clockSupplier, TokenSource tokenSource) {
    this.clockSupplier = clockSupplier;
    this.tokenSource = tokenSource;
  }

  /**
   * Returns a valid {@link Token}. If the current token is null or invalid, this method will obtain
   * a new token from the underlying {@link TokenSource}.
   *
   * @return a valid {@link Token}
   */
  public synchronized Token getToken() {
    if (!isValid(clockSupplier, token)) {
      token = tokenSource.getToken();
    }
    return token;
  }

  private static boolean isValid(ClockSupplier clockSupplier, Token token) {
    if (token == null || token.getAccessToken() == null) {
      return false;
    }
    if (token.getExpiry() == null) {
      return true;
    }

    // Azure Databricks rejects tokens that expire within 30 seconds. We add a buffer
    // of 10 seconds to reduce the risk of sending tokens that will be rejected.
    LocalDateTime expiry = token.getExpiry().minusSeconds(30 + 10);
    LocalDateTime now = LocalDateTime.now(clockSupplier.getClock());
    return now.isBefore(expiry);
  }
}
