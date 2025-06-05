// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Activity recorded for the action. */
@Generated
class ActivityPb {
  @JsonProperty("activity_type")
  private ActivityType activityType;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  @JsonProperty("from_stage")
  private Stage fromStage;

  @JsonProperty("id")
  private String id;

  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  @JsonProperty("system_comment")
  private String systemComment;

  @JsonProperty("to_stage")
  private Stage toStage;

  @JsonProperty("user_id")
  private String userId;

  public ActivityPb setActivityType(ActivityType activityType) {
    this.activityType = activityType;
    return this;
  }

  public ActivityType getActivityType() {
    return activityType;
  }

  public ActivityPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ActivityPb setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ActivityPb setFromStage(Stage fromStage) {
    this.fromStage = fromStage;
    return this;
  }

  public Stage getFromStage() {
    return fromStage;
  }

  public ActivityPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ActivityPb setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public ActivityPb setSystemComment(String systemComment) {
    this.systemComment = systemComment;
    return this;
  }

  public String getSystemComment() {
    return systemComment;
  }

  public ActivityPb setToStage(Stage toStage) {
    this.toStage = toStage;
    return this;
  }

  public Stage getToStage() {
    return toStage;
  }

  public ActivityPb setUserId(String userId) {
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
    ActivityPb that = (ActivityPb) o;
    return Objects.equals(activityType, that.activityType)
        && Objects.equals(comment, that.comment)
        && Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(fromStage, that.fromStage)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(systemComment, that.systemComment)
        && Objects.equals(toStage, that.toStage)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activityType,
        comment,
        creationTimestamp,
        fromStage,
        id,
        lastUpdatedTimestamp,
        systemComment,
        toStage,
        userId);
  }

  @Override
  public String toString() {
    return new ToStringer(ActivityPb.class)
        .add("activityType", activityType)
        .add("comment", comment)
        .add("creationTimestamp", creationTimestamp)
        .add("fromStage", fromStage)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("systemComment", systemComment)
        .add("toStage", toStage)
        .add("userId", userId)
        .toString();
  }
}
