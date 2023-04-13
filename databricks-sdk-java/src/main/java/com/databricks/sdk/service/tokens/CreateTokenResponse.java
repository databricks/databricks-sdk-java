// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokens;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTokenResponse that = (CreateTokenResponse) o;
    return Objects.equals(tokenInfo, that.tokenInfo) && Objects.equals(tokenValue, that.tokenValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenInfo, tokenValue);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTokenResponse.class)
        .add("tokenInfo", tokenInfo)
        .add("tokenValue", tokenValue)
        .toString();
  }
}
