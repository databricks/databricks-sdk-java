// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListSharesResponse {
  /** An array of data share information objects. */
  @JsonProperty("shares")
  private java.util.List<ShareInfo> shares;

  public ListSharesResponse setShares(java.util.List<ShareInfo> shares) {
    this.shares = shares;
    return this;
  }

  public java.util.List<ShareInfo> getShares() {
    return shares;
  }
}
