// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokenmanagement;

/** Delete a token */
public class Delete {
  /** The ID of the token to get. */
  private String tokenId;

  public Delete setTokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  public String getTokenId() {
    return tokenId;
  }
}
