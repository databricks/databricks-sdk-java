// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokenmanagement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListTokensResponse {
  /** */
  @JsonProperty("token_infos")
  private java.util.List<TokenInfo> tokenInfos;

  public ListTokensResponse setTokenInfos(java.util.List<TokenInfo> tokenInfos) {
    this.tokenInfos = tokenInfos;
    return this;
  }

  public java.util.List<TokenInfo> getTokenInfos() {
    return tokenInfos;
  }
}
