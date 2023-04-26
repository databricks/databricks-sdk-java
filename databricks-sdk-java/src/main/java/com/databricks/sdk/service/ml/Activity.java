// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Activity recorded for the action.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Activity {
  /** This describes an enum */
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

  /**
   * <p>Setter for the field <code>activityType</code>.</p>
   *
   * @param activityType a {@link com.databricks.sdk.service.ml.ActivityType} object
   * @return a {@link com.databricks.sdk.service.ml.Activity} object
   */
  public Activity setActivityType(ActivityType activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * <p>Getter for the field <code>activityType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.ActivityType} object
   */
  public ActivityType getActivityType() {
    return activityType;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.Activity} object
   */
  public Activity setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>creationTimestamp</code>.</p>
   *
   * @param creationTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.Activity} object
   */
  public Activity setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTimestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * <p>Setter for the field <code>fromStage</code>.</p>
   *
   * @param fromStage a {@link com.databricks.sdk.service.ml.Stage} object
   * @return a {@link com.databricks.sdk.service.ml.Activity} object
   */
  public Activity setFromStage(Stage fromStage) {
    this.fromStage = fromStage;
    return this;
  }

  /**
   * <p>Getter for the field <code>fromStage</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.Stage} object
   */
  public Stage getFromStage() {
    return fromStage;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.Activity} object
   */
  public Activity setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /**
   * <p>Setter for the field <code>lastUpdatedTimestamp</code>.</p>
   *
   * @param lastUpdatedTimestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.Activity} object
   */
  public Activity setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastUpdatedTimestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  /**
   * <p>Setter for the field <code>systemComment</code>.</p>
   *
   * @param systemComment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.Activity} object
   */
  public Activity setSystemComment(String systemComment) {
    this.systemComment = systemComment;
    return this;
  }

  /**
   * <p>Getter for the field <code>systemComment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSystemComment() {
    return systemComment;
  }

  /**
   * <p>Setter for the field <code>toStage</code>.</p>
   *
   * @param toStage a {@link com.databricks.sdk.service.ml.Stage} object
   * @return a {@link com.databricks.sdk.service.ml.Activity} object
   */
  public Activity setToStage(Stage toStage) {
    this.toStage = toStage;
    return this;
  }

  /**
   * <p>Getter for the field <code>toStage</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.Stage} object
   */
  public Stage getToStage() {
    return toStage;
  }

  /**
   * <p>Setter for the field <code>userId</code>.</p>
   *
   * @param userId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.Activity} object
   */
  public Activity setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * <p>Getter for the field <code>userId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUserId() {
    return userId;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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
