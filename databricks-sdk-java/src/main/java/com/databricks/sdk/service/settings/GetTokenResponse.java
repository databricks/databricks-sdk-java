// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Token with specified Token ID was successfully returned. */
@Generated
public class GetTokenResponse {
  /** */
  @JsonProperty("token_info")
  private TokenInfo tokenInfo;

  public GetTokenResponse setTokenInfo(TokenInfo tokenInfo) {
    this.tokenInfo = tokenInfo;
    return this;
  }

  public TokenInfo getTokenInfo() {
    return tokenInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetTokenResponse that = (GetTokenResponse) o;
    return Objects.equals(tokenInfo, that.tokenInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(GetTokenResponse.class).add("tokenInfo", tokenInfo).toString();
  }
}
