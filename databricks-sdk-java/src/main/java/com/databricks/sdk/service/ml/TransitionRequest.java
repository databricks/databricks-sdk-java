// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Transition request details. */
public class TransitionRequest {
  /** Array of actions on the activity allowed for the current viewer. */
  @JsonProperty("available_actions")
  private Collection<ActivityAction> availableActions;

  /** User-provided comment associated with the transition request. */
  @JsonProperty("comment")
  private String comment;

  /** Creation time of the object, as a Unix timestamp in milliseconds. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /**
   * Target stage of the transition (if the activity is stage transition related). Valid values are:
   *
   * <p>* `None`: The initial stage of a model version.
   *
   * <p>* `Staging`: Staging or pre-production stage.
   *
   * <p>* `Production`: Production stage.
   *
   * <p>* `Archived`: Archived stage.
   */
  @JsonProperty("to_stage")
  private Stage toStage;

  /** The username of the user that created the object. */
  @JsonProperty("user_id")
  private String userId;

  public TransitionRequest setAvailableActions(Collection<ActivityAction> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  public Collection<ActivityAction> getAvailableActions() {
    return availableActions;
  }

  public TransitionRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public TransitionRequest setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public TransitionRequest setToStage(Stage toStage) {
    this.toStage = toStage;
    return this;
  }

  public Stage getToStage() {
    return toStage;
  }

  public TransitionRequest setUserId(String userId) {
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
    TransitionRequest that = (TransitionRequest) o;
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
    return new ToStringer(TransitionRequest.class)
        .add("availableActions", availableActions)
        .add("comment", comment)
        .add("creationTimestamp", creationTimestamp)
        .add("toStage", toStage)
        .add("userId", userId)
        .toString();
  }
}
