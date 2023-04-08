// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokenmanagement;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateOboTokenResponse {
  /** */
  @JsonProperty("token_info")
  private TokenInfo tokenInfo;

  /** Value of the token. */
  @JsonProperty("token_value")
  private String tokenValue;

  public CreateOboTokenResponse setTokenInfo(TokenInfo tokenInfo) {
    this.tokenInfo = tokenInfo;
    return this;
  }

  public TokenInfo getTokenInfo() {
    return tokenInfo;
  }

  public CreateOboTokenResponse setTokenValue(String tokenValue) {
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
    CreateOboTokenResponse that = (CreateOboTokenResponse) o;
    return Objects.equals(tokenInfo, that.tokenInfo) && Objects.equals(tokenValue, that.tokenValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenInfo, tokenValue);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateOboTokenResponse.class)
        .add("tokenInfo", tokenInfo)
        .add("tokenValue", tokenValue)
        .toString();
  }
}
