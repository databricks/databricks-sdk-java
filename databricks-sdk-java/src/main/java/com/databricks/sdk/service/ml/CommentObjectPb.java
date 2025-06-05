// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Comment details. */
@Generated
class CommentObjectPb {
  @JsonProperty("available_actions")
  private Collection<CommentActivityAction> availableActions;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  @JsonProperty("id")
  private String id;

  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  @JsonProperty("user_id")
  private String userId;

  public CommentObjectPb setAvailableActions(Collection<CommentActivityAction> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  public Collection<CommentActivityAction> getAvailableActions() {
    return availableActions;
  }

  public CommentObjectPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CommentObjectPb setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public CommentObjectPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CommentObjectPb setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public CommentObjectPb setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommentObjectPb that = (CommentObjectPb) o;
    return Objects.equals(availableActions, that.availableActions)
        && Objects.equals(comment, that.comment)
        && Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        availableActions, comment, creationTimestamp, id, lastUpdatedTimestamp, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(CommentObjectPb.class)
        .add("availableActions", availableActions)
        .add("comment", comment)
        .add("creationTimestamp", creationTimestamp)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("userId", userId)
        .toString();
  }
}
