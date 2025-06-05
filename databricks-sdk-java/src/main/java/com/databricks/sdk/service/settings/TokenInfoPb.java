// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class TokenInfoPb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("created_by_id")
  private Long createdById;

  @JsonProperty("created_by_username")
  private String createdByUsername;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("expiry_time")
  private Long expiryTime;

  @JsonProperty("last_used_day")
  private Long lastUsedDay;

  @JsonProperty("owner_id")
  private Long ownerId;

  @JsonProperty("token_id")
  private String tokenId;

  @JsonProperty("workspace_id")
  private Long workspaceId;

  public TokenInfoPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public TokenInfoPb setCreatedById(Long createdById) {
    this.createdById = createdById;
    return this;
  }

  public Long getCreatedById() {
    return createdById;
  }

  public TokenInfoPb setCreatedByUsername(String createdByUsername) {
    this.createdByUsername = createdByUsername;
    return this;
  }

  public String getCreatedByUsername() {
    return createdByUsername;
  }

  public TokenInfoPb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public TokenInfoPb setExpiryTime(Long expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  public Long getExpiryTime() {
    return expiryTime;
  }

  public TokenInfoPb setLastUsedDay(Long lastUsedDay) {
    this.lastUsedDay = lastUsedDay;
    return this;
  }

  public Long getLastUsedDay() {
    return lastUsedDay;
  }

  public TokenInfoPb setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  public Long getOwnerId() {
    return ownerId;
  }

  public TokenInfoPb setTokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  public String getTokenId() {
    return tokenId;
  }

  public TokenInfoPb setWorkspaceId(Long workspaceId) {
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
    TokenInfoPb that = (TokenInfoPb) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createdById, that.createdById)
        && Objects.equals(createdByUsername, that.createdByUsername)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(expiryTime, that.expiryTime)
        && Objects.equals(lastUsedDay, that.lastUsedDay)
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
        lastUsedDay,
        ownerId,
        tokenId,
        workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenInfoPb.class)
        .add("comment", comment)
        .add("createdById", createdById)
        .add("createdByUsername", createdByUsername)
        .add("creationTime", creationTime)
        .add("expiryTime", expiryTime)
        .add("lastUsedDay", lastUsedDay)
        .add("ownerId", ownerId)
        .add("tokenId", tokenId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
