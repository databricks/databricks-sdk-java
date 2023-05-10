package com.databricks.sdk.core.oauth;

import com.fasterxml.jackson.annotation.JsonProperty;
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

  /** Constructor for non-refreshable tokens (e.g. M2M). */
  public Token(String accessToken, String tokenType, LocalDateTime expiry) {
    this(accessToken, tokenType, null, expiry);
  }

  /** Constructor for refreshable tokens. */
  public Token(String accessToken, String tokenType, String refreshToken, LocalDateTime expiry) {
    Objects.requireNonNull(accessToken, "accessToken must be defined");
    Objects.requireNonNull(tokenType, "tokenType must be defined");
    Objects.requireNonNull(expiry, "expiry must be defined");
    this.accessToken = accessToken;
    this.tokenType = tokenType;
    this.refreshToken = refreshToken;
    this.expiry = expiry;
  }

  public boolean isExpired() {
    if (expiry == null) {
      return false;
    }
    LocalDateTime potentiallyExpired = expiry.minus(10, ChronoUnit.SECONDS);
    LocalDateTime now = LocalDateTime.now();
    return potentiallyExpired.isBefore(now);
  }

  public boolean isValid() {
    return accessToken != null && !isExpired();
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public String getAccessToken() {
    return accessToken;
  }
}
