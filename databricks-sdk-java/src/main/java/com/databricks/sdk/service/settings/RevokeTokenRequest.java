// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RevokeTokenRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RevokeTokenRequest {
  /** The ID of the token to be revoked. */
  @JsonProperty("token_id")
  private String tokenId;

  /**
   * <p>Setter for the field <code>tokenId</code>.</p>
   *
   * @param tokenId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.RevokeTokenRequest} object
   */
  public RevokeTokenRequest setTokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  /**
   * <p>Getter for the field <code>tokenId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTokenId() {
    return tokenId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RevokeTokenRequest that = (RevokeTokenRequest) o;
    return Objects.equals(tokenId, that.tokenId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(tokenId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RevokeTokenRequest.class).add("tokenId", tokenId).toString();
  }
}
