// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RevokeTokenRequest {
  /** The ID of the token to be revoked. */
  @JsonProperty("token_id")
  private String tokenId;

  public RevokeTokenRequest setTokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  public String getTokenId() {
    return tokenId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RevokeTokenRequest that = (RevokeTokenRequest) o;
    return Objects.equals(tokenId, that.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId);
  }

  @Override
  public String toString() {
    return new ToStringer(RevokeTokenRequest.class).add("tokenId", tokenId).toString();
  }
}
