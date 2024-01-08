// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListPublicTokensResponse {
  /** The information for each token. */
  @JsonProperty("token_infos")
  private Collection<PublicTokenInfo> tokenInfos;

  public ListPublicTokensResponse setTokenInfos(Collection<PublicTokenInfo> tokenInfos) {
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
    ListPublicTokensResponse that = (ListPublicTokensResponse) o;
    return Objects.equals(tokenInfos, that.tokenInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenInfos);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPublicTokensResponse.class).add("tokenInfos", tokenInfos).toString();
  }
}
