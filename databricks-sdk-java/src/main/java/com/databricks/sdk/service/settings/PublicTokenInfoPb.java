// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PublicTokenInfoPb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("expiry_time")
  private Long expiryTime;

  @JsonProperty("token_id")
  private String tokenId;

  public PublicTokenInfoPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public PublicTokenInfoPb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public PublicTokenInfoPb setExpiryTime(Long expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  public Long getExpiryTime() {
    return expiryTime;
  }

  public PublicTokenInfoPb setTokenId(String tokenId) {
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
    PublicTokenInfoPb that = (PublicTokenInfoPb) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(expiryTime, that.expiryTime)
        && Objects.equals(tokenId, that.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, creationTime, expiryTime, tokenId);
  }

  @Override
  public String toString() {
    return new ToStringer(PublicTokenInfoPb.class)
        .add("comment", comment)
        .add("creationTime", creationTime)
        .add("expiryTime", expiryTime)
        .add("tokenId", tokenId)
        .toString();
  }
}
