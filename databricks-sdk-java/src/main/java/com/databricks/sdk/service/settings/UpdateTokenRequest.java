// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateTokenRequest {
  /** */
  @JsonProperty("token")
  private PublicTokenInfo token;

  /** The SHA-256 hash of the token to be updated. */
  @JsonIgnore private String tokenId;

  /**
   * A list of field name under PublicTokenInfo, For example in request use {"update_mask":
   * "comment,scopes"}
   *
   * <p>The field mask must be a single string, with multiple fields separated by commas (no
   * spaces). The field path is relative to the resource object, using a dot (`.`) to navigate
   * sub-fields (e.g., `author.given_name`). Specification of elements in sequence or map fields is
   * not allowed, as only the entire collection field can be specified. Field names must exactly
   * match the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
   */
  @JsonProperty("update_mask")
  private FieldMask updateMask;

  public UpdateTokenRequest setToken(PublicTokenInfo token) {
    this.token = token;
    return this;
  }

  public PublicTokenInfo getToken() {
    return token;
  }

  public UpdateTokenRequest setTokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  public String getTokenId() {
    return tokenId;
  }

  public UpdateTokenRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateTokenRequest that = (UpdateTokenRequest) o;
    return Objects.equals(token, that.token)
        && Objects.equals(tokenId, that.tokenId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, tokenId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateTokenRequest.class)
        .add("token", token)
        .add("tokenId", tokenId)
        .add("updateMask", updateMask)
        .toString();
  }
}
