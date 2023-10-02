// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Activity recorded for the action. */
@Generated
public class Activity {
  /**
   * Type of activity. Valid values are: * `APPLIED_TRANSITION`: User applied the corresponding
   * stage transition.
   *
   * <p>* `REQUESTED_TRANSITION`: User requested the corresponding stage transition.
   *
   * <p>* `CANCELLED_REQUEST`: User cancelled an existing transition request.
   *
   * <p>* `APPROVED_REQUEST`: User approved the corresponding stage transition.
   *
   * <p>* `REJECTED_REQUEST`: User rejected the coressponding stage transition.
   *
   * <p>* `SYSTEM_TRANSITION`: For events performed as a side effect, such as archiving existing
   * model versions in a stage.
   */
  @JsonProperty("activity_type")
  private ActivityType activityType;

  /** User-provided comment associated with the activity. */
  @JsonProperty("comment")
  private String comment;

  /** Creation time of the object, as a Unix timestamp in milliseconds. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /**
   * Source stage of the transition (if the activity is stage transition related). Valid values are:
   *
   * <p>* `None`: The initial stage of a model version.
   *
   * <p>* `Staging`: Staging or pre-production stage.
   *
   * <p>* `Production`: Production stage.
   *
   * <p>* `Archived`: Archived stage.
   */
  @JsonProperty("from_stage")
  private Stage fromStage;

  /** Unique identifier for the object. */
  @JsonProperty("id")
  private String id;

  /** Time of the object at last update, as a Unix timestamp in milliseconds. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /**
   * Comment made by system, for example explaining an activity of type `SYSTEM_TRANSITION`. It
   * usually describes a side effect, such as a version being archived as part of another version's
   * stage transition, and may not be returned for some activity types.
   */
  @JsonProperty("system_comment")
  private String systemComment;

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

  public Activity setActivityType(ActivityType activityType) {
    this.activityType = activityType;
    return this;
  }

  public ActivityType getActivityType() {
    return activityType;
  }

  public Activity setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public Activity setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public Activity setFromStage(Stage fromStage) {
    this.fromStage = fromStage;
    return this;
  }

  public Stage getFromStage() {
    return fromStage;
  }

  public Activity setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Activity setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public Activity setSystemComment(String systemComment) {
    this.systemComment = systemComment;
    return this;
  }

  public String getSystemComment() {
    return systemComment;
  }

  public Activity setToStage(Stage toStage) {
    this.toStage = toStage;
    return this;
  }

  public Stage getToStage() {
    return toStage;
  }

  public Activity setUserId(String userId) {
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
    Activity that = (Activity) o;
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
    return new ToStringer(Activity.class)
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
