package com.databricks.sdk.client.oauth;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Token {
  private String accessToken;
  private String tokenType;
  private String refreshToken;
  private LocalDateTime expiry;

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

  public Map<String, String> asDict() {
    Map<String, String> raw = new HashMap<>();
    raw.put("access_token", accessToken);
    raw.put("token_type", tokenType);
    if (expiry != null) {
      raw.put("expiry", expiry.toString());
    }
    if (refreshToken != null) {
      raw.put("refresh_token", refreshToken);
    }
    return raw;
  }

  public static Token fromDict(Map<String, Object> raw) {
    return new Token(
        (String) raw.get("access_token"),
        (String) raw.get("token_type"),
        (String) raw.get("refresh_token"),
        Optional.ofNullable((String) raw.get("expiry")).map(LocalDateTime::parse).orElse(null));
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
