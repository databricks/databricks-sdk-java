// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateTokenResponsePb {
  @JsonProperty("token_info")
  private PublicTokenInfo tokenInfo;

  @JsonProperty("token_value")
  private String tokenValue;

  public CreateTokenResponsePb setTokenInfo(PublicTokenInfo tokenInfo) {
    this.tokenInfo = tokenInfo;
    return this;
  }

  public PublicTokenInfo getTokenInfo() {
    return tokenInfo;
  }

  public CreateTokenResponsePb setTokenValue(String tokenValue) {
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
    CreateTokenResponsePb that = (CreateTokenResponsePb) o;
    return Objects.equals(tokenInfo, that.tokenInfo) && Objects.equals(tokenValue, that.tokenValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenInfo, tokenValue);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTokenResponsePb.class)
        .add("tokenInfo", tokenInfo)
        .add("tokenValue", tokenValue)
        .toString();
  }
}
