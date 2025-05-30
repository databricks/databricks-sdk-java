package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.utils.ClockSupplier;
import com.databricks.sdk.core.utils.SystemClockSupplier;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Token {
  @JsonProperty private String accessToken;

  @JsonProperty private String tokenType;

  @JsonProperty private String refreshToken;

  /**
   * The expiry time of the token.
   *
   * <p>OAuth token responses include the duration of the lifetime of the access token. When the
   * token is retrieved, this is converted to a LocalDateTime tracking the expiry time of the token
   * with respect to the current clock.
   */
  @JsonProperty private LocalDateTime expiry;

  private final ClockSupplier clockSupplier;

  /** Constructor for non-refreshable tokens (e.g. M2M). */
  public Token(String accessToken, String tokenType, LocalDateTime expiry) {
    this(accessToken, tokenType, null, expiry, new SystemClockSupplier());
  }

  /** Constructor for non-refreshable tokens (e.g. M2M) with ClockSupplier */
  public Token(
      String accessToken, String tokenType, LocalDateTime expiry, ClockSupplier clockSupplier) {
    this(accessToken, tokenType, null, expiry, clockSupplier);
  }

  /** Constructor for refreshable tokens. */
  @JsonCreator
  public Token(
      @JsonProperty("accessToken") String accessToken,
      @JsonProperty("tokenType") String tokenType,
      @JsonProperty("refreshToken") String refreshToken,
      @JsonProperty("expiry") LocalDateTime expiry) {
    this(accessToken, tokenType, refreshToken, expiry, new SystemClockSupplier());
  }

  /** Constructor for refreshable tokens with ClockSupplier. */
  public Token(
      String accessToken,
      String tokenType,
      String refreshToken,
      LocalDateTime expiry,
      ClockSupplier clockSupplier) {
    Objects.requireNonNull(accessToken, "accessToken must be defined");
    Objects.requireNonNull(tokenType, "tokenType must be defined");
    Objects.requireNonNull(expiry, "expiry must be defined");
    Objects.requireNonNull(clockSupplier, "clockSupplier must be defined");
    this.accessToken = accessToken;
    this.tokenType = tokenType;
    this.refreshToken = refreshToken;
    this.expiry = expiry;
    this.clockSupplier = clockSupplier;
  }

  /**
   * Checks if the token is expired. Tokens are considered expired 40 seconds before their actual
   * expiry time to account for Azure Databricks rejecting tokens that expire in 30 seconds or less.
   *
   * @return true if the token is expired or about to expire, false otherwise
   */
  public boolean isExpired() {
    if (expiry == null) {
      return false;
    }
    // Azure Databricks rejects tokens that expire in 30 seconds or less,
    // so we refresh the token 40 seconds before it expires.
    LocalDateTime potentiallyExpired = expiry.minus(40, ChronoUnit.SECONDS);
    LocalDateTime now = LocalDateTime.now(clockSupplier.getClock());
    return potentiallyExpired.isBefore(now);
  }

  /**
   * Checks if the token is valid. A token is valid if it has a non-null access token and is not
   * expired.
   *
   * @return true if the token is valid, false otherwise
   */
  public boolean isValid() {
    return accessToken != null && !isExpired();
  }

  /**
   * Returns the type of the token (e.g., "Bearer").
   *
   * @return the token type
   */
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

  /**
   * Returns the remaining lifetime of the token as a Duration.
   *
   * @return the duration between now and the token's expiry
   */
  public Duration getLifetime() {
    return Duration.between(LocalDateTime.now(clockSupplier.getClock()), this.expiry);
  }
}
