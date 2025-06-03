package com.databricks.sdk.core.oauth;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
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

  /** Constructor for non-refreshable tokens (e.g. M2M). */
  public Token(String accessToken, String tokenType, LocalDateTime expiry) {
    this(accessToken, tokenType, null, expiry);
  }

  /** Constructor for refreshable tokens. */
  @JsonCreator
  public Token(
      @JsonProperty("accessToken") String accessToken,
      @JsonProperty("tokenType") String tokenType,
      @JsonProperty("refreshToken") String refreshToken,
      @JsonProperty("expiry") LocalDateTime expiry) {
    Objects.requireNonNull(accessToken, "accessToken must be defined");
    Objects.requireNonNull(tokenType, "tokenType must be defined");
    Objects.requireNonNull(expiry, "expiry must be defined");
    this.accessToken = accessToken;
    this.tokenType = tokenType;
    this.refreshToken = refreshToken;
    this.expiry = expiry;
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
}
