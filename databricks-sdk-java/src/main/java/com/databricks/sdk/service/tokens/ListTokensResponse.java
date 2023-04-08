// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokens;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListTokensResponse {
  /** The information for each token. */
  @JsonProperty("token_infos")
  private java.util.List<PublicTokenInfo> tokenInfos;

  public ListTokensResponse setTokenInfos(java.util.List<PublicTokenInfo> tokenInfos) {
    this.tokenInfos = tokenInfos;
    return this;
  }

  public java.util.List<PublicTokenInfo> getTokenInfos() {
    return tokenInfos;
  }
}
