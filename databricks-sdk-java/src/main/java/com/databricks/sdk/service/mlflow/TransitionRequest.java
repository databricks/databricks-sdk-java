// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Transition request details. */
public class TransitionRequest {
  /** Array of actions on the activity allowed for the current viewer. */
  @JsonProperty("available_actions")
  private java.util.List<ActivityAction> availableActions;

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

  public TransitionRequest setAvailableActions(java.util.List<ActivityAction> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  public java.util.List<ActivityAction> getAvailableActions() {
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
}
