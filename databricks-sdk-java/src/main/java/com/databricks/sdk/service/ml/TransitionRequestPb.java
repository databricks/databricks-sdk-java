// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Transition request details. */
@Generated
class TransitionRequestPb {
  @JsonProperty("available_actions")
  private Collection<ActivityAction> availableActions;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  @JsonProperty("to_stage")
  private Stage toStage;

  @JsonProperty("user_id")
  private String userId;

  public TransitionRequestPb setAvailableActions(Collection<ActivityAction> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  public Collection<ActivityAction> getAvailableActions() {
    return availableActions;
  }

  public TransitionRequestPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public TransitionRequestPb setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public TransitionRequestPb setToStage(Stage toStage) {
    this.toStage = toStage;
    return this;
  }

  public Stage getToStage() {
    return toStage;
  }

  public TransitionRequestPb setUserId(String userId) {
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
    TransitionRequestPb that = (TransitionRequestPb) o;
    return Objects.equals(availableActions, that.availableActions)
        && Objects.equals(comment, that.comment)
        && Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(toStage, that.toStage)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableActions, comment, creationTimestamp, toStage, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(TransitionRequestPb.class)
        .add("availableActions", availableActions)
        .add("comment", comment)
        .add("creationTimestamp", creationTimestamp)
        .add("toStage", toStage)
        .add("userId", userId)
        .toString();
  }
}
