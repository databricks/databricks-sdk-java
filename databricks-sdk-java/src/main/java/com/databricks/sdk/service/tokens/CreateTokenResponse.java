// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokens;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateTokenResponse {
  /** The information for the new token. */
  @JsonProperty("token_info")
  private PublicTokenInfo tokenInfo;

  /** The value of the new token. */
  @JsonProperty("token_value")
  private String tokenValue;

  public CreateTokenResponse setTokenInfo(PublicTokenInfo tokenInfo) {
    this.tokenInfo = tokenInfo;
    return this;
  }

  public PublicTokenInfo getTokenInfo() {
    return tokenInfo;
  }

  public CreateTokenResponse setTokenValue(String tokenValue) {
    this.tokenValue = tokenValue;
    return this;
  }

  public String getTokenValue() {
    return tokenValue;
  }
}
