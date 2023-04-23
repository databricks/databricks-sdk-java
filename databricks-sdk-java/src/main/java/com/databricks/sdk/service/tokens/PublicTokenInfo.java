// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokens;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class PublicTokenInfo {
  /** Comment the token was created with, if applicable. */
  @JsonProperty("comment")
  private String comment;

  /** Server time (in epoch milliseconds) when the token was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** Server time (in epoch milliseconds) when the token will expire, or -1 if not applicable. */
  @JsonProperty("expiry_time")
  private Long expiryTime;

  /** The ID of this token. */
  @JsonProperty("token_id")
  private String tokenId;

  public PublicTokenInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public PublicTokenInfo setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public PublicTokenInfo setExpiryTime(Long expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  public Long getExpiryTime() {
    return expiryTime;
  }

  public PublicTokenInfo setTokenId(String tokenId) {
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
    PublicTokenInfo that = (PublicTokenInfo) o;
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
    return new ToStringer(PublicTokenInfo.class)
        .add("comment", comment)
        .add("creationTime", creationTime)
        .add("expiryTime", expiryTime)
        .add("tokenId", tokenId)
        .toString();
  }
}
