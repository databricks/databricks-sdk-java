package com.databricks.sdk.client.oauth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OAuthResponse {
  @JsonProperty("error")
  private String error;

  @JsonProperty("errorCode")
  private String errorCode;

  @JsonProperty("errorSummary")
  private String errorSummary;

  @JsonProperty("error_description")
  private String errorDescription;

  public String getErrorCode() {
    if (errorCode != null) {
      return errorCode;
    }
    return error;
  }

  public String getErrorSummary() {
    if (errorSummary != null) {
      return errorSummary;
    }
    return errorDescription;
  }

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
