package com.databricks.sdk.client.oauth;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Token {
  @JsonProperty
  private String accessToken;

  @JsonProperty
  private String tokenType;

  @JsonProperty
  private String refreshToken;

  @JsonProperty
  private LocalDateTime expiry;

  /** Constructor for non-refreshable tokens (e.g. M2M). */
  public Token(String accessToken, String tokenType, LocalDateTime expiry) {
    this(accessToken, tokenType, null, expiry);
  }

  /** Constructor for refreshable tokens. */
  public Token(String accessToken, String tokenType, String refreshToken, LocalDateTime expiry) {
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
