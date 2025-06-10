package com.databricks.sdk.core.oauth;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.Objects;

public class Token {
  @JsonProperty private String accessToken;

  @JsonProperty private String tokenType;

  @JsonProperty private String refreshToken;

  /**
   * The expiry time of the token.
   *
   * <p>OAuth token responses include the duration of the lifetime of the access token. When the
   * token is retrieved, this is converted to an Instant tracking the expiry time of the token with
   * respect to the current clock.
   */
  @JsonProperty private Instant expiry;

  private final ClockSupplier clockSupplier;

  /** Constructor for non-refreshable tokens (e.g. M2M). */
  public Token(String accessToken, String tokenType, Instant expiry) {
    this(accessToken, tokenType, null, expiry, new SystemClockSupplier());
  }

  /** Constructor for non-refreshable tokens (e.g. M2M) with ClockSupplier */
  public Token(String accessToken, String tokenType, Instant expiry, ClockSupplier clockSupplier) {
    this(accessToken, tokenType, null, expiry, clockSupplier);
  }

  /** Constructor for refreshable tokens. */
  @JsonCreator
  public Token(
      @JsonProperty("accessToken") String accessToken,
      @JsonProperty("tokenType") String tokenType,
      @JsonProperty("refreshToken") String refreshToken,
      @JsonProperty("expiry") Instant expiry) {
    this(accessToken, tokenType, refreshToken, expiry, new SystemClockSupplier());
  }

  /** Constructor for refreshable tokens with ClockSupplier. */
  public Token(
      String accessToken,
      String tokenType,
      String refreshToken,
      Instant expiry,
      ClockSupplier clockSupplier) {
    Objects.requireNonNull(accessToken, "accessToken must be defined");
    Objects.requireNonNull(tokenType, "tokenType must be defined");
    Objects.requireNonNull(expiry, "expiry must be defined");
    this.accessToken = accessToken;
    this.tokenType = tokenType;
    this.refreshToken = refreshToken;
    this.expiry = expiry;
    this.clockSupplier = clockSupplier;
  }

  public boolean isExpired() {
    if (expiry == null) {
      return false;
    }
    // Azure Databricks rejects tokens that expire in 30 seconds or less,
    // so we refresh the token 40 seconds before it expires.
    Instant potentiallyExpired = expiry.minusSeconds(40);
    Instant now = Instant.now(clockSupplier.getClock());
    return potentiallyExpired.isBefore(now);
  }

  public boolean isValid() {
    return accessToken != null && !isExpired();
  }

  public String getTokenType() {
    return tokenType;
  }

  /**
   * Returns the refresh token, if available. May be null for non-refreshable tokens.
   *
   * @return the refresh token or null
   */
  public String getRefreshToken() {
    return refreshToken;
  }

  /**
   * Returns the access token string.
   *
   * @return the access token
   */
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * Returns the expiry time of the token as a LocalDateTime.
   *
   * @return the expiry time
   */
  public LocalDateTime getExpiry() {
    return this.expiry;
  }
}
