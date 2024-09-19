// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TokenInfo {
  /** Comment that describes the purpose of the token, specified by the token creator. */
  @JsonProperty("comment")
  private String comment;

  /** User ID of the user that created the token. */
  @JsonProperty("created_by_id")
  private Long createdById;

  /** Username of the user that created the token. */
  @JsonProperty("created_by_username")
  private String createdByUsername;

  /** Timestamp when the token was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /** Timestamp when the token expires. */
  @JsonProperty("expiry_time")
  private Long expiryTime;

  /** User ID of the user that owns the token. */
  @JsonProperty("owner_id")
  private Long ownerId;

  /** ID of the token. */
  @JsonProperty("token_id")
  private String tokenId;

  /** If applicable, the ID of the workspace that the token was created in. */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  public TokenInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public TokenInfo setCreatedById(Long createdById) {
    this.createdById = createdById;
    return this;
  }

  public Long getCreatedById() {
    return createdById;
  }

  public TokenInfo setCreatedByUsername(String createdByUsername) {
    this.createdByUsername = createdByUsername;
    return this;
  }

  public String getCreatedByUsername() {
    return createdByUsername;
  }

  public TokenInfo setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public TokenInfo setExpiryTime(Long expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  public Long getExpiryTime() {
    return expiryTime;
  }

  public TokenInfo setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  public Long getOwnerId() {
    return ownerId;
  }

  public TokenInfo setTokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  public String getTokenId() {
    return tokenId;
  }

  public TokenInfo setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenInfo that = (TokenInfo) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createdById, that.createdById)
        && Objects.equals(createdByUsername, that.createdByUsername)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(expiryTime, that.expiryTime)
        && Objects.equals(ownerId, that.ownerId)
        && Objects.equals(tokenId, that.tokenId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        createdById,
        createdByUsername,
        creationTime,
        expiryTime,
        ownerId,
        tokenId,
        workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenInfo.class)
        .add("comment", comment)
        .add("createdById", createdById)
        .add("createdByUsername", createdByUsername)
        .add("creationTime", creationTime)
        .add("expiryTime", expiryTime)
        .add("ownerId", ownerId)
        .add("tokenId", tokenId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
