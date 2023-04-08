// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Comment details. */
public class CommentObject {
  /** Array of actions on the activity allowed for the current viewer. */
  @JsonProperty("available_actions")
  private Collection<CommentActivityAction> availableActions;

  /** User-provided comment on the action. */
  @JsonProperty("comment")
  private String comment;

  /** Creation time of the object, as a Unix timestamp in milliseconds. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** Time of the object at last update, as a Unix timestamp in milliseconds. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** The username of the user that created the object. */
  @JsonProperty("user_id")
  private String userId;

  public CommentObject setAvailableActions(Collection<CommentActivityAction> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  public Collection<CommentActivityAction> getAvailableActions() {
    return availableActions;
  }

  public CommentObject setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CommentObject setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public CommentObject setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public CommentObject setUserId(String userId) {
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
    CommentObject that = (CommentObject) o;
    return Objects.equals(availableActions, that.availableActions)
        && Objects.equals(comment, that.comment)
        && Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableActions, comment, creationTimestamp, lastUpdatedTimestamp, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(CommentObject.class)
        .add("availableActions", availableActions)
        .add("comment", comment)
        .add("creationTimestamp", creationTimestamp)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("userId", userId)
        .toString();
  }
}
