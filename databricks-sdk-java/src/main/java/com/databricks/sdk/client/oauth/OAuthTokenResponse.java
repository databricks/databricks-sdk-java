package com.databricks.sdk.client.oauth;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuthTokenResponse {
  @JsonProperty("expires_in")
  private int expiresIn;

  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("refresh_token")
  private String refreshToken;

  @JsonProperty("token_type")
  private String tokenType;

  public int getExpiresIn() {
    return expiresIn;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public String getTokenType() {
    return tokenType;
  }
}
