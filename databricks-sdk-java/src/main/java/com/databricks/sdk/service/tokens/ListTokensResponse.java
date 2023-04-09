// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokens;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListTokensResponse {
  /** The information for each token. */
  @JsonProperty("token_infos")
  private Collection<PublicTokenInfo> tokenInfos;

  public ListTokensResponse setTokenInfos(Collection<PublicTokenInfo> tokenInfos) {
    this.tokenInfos = tokenInfos;
    return this;
  }

  public Collection<PublicTokenInfo> getTokenInfos() {
    return tokenInfos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTokensResponse that = (ListTokensResponse) o;
    return Objects.equals(tokenInfos, that.tokenInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenInfos);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTokensResponse.class).add("tokenInfos", tokenInfos).toString();
  }
}
