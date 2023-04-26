// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>CreateRun class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateRun {
  /** ID of the associated experiment. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** Unix timestamp in milliseconds of when the run started. */
  @JsonProperty("start_time")
  private Long startTime;

  /** Additional metadata for run. */
  @JsonProperty("tags")
  private Collection<RunTag> tags;

  /**
   * ID of the user executing the run. This field is deprecated as of MLflow 1.0, and will be
   * removed in a future MLflow release. Use 'mlflow.user' tag instead.
   */
  @JsonProperty("user_id")
  private String userId;

  /**
   * <p>Setter for the field <code>experimentId</code>.</p>
   *
   * @param experimentId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.CreateRun} object
   */
  public CreateRun setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  /**
   * <p>Getter for the field <code>experimentId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExperimentId() {
    return experimentId;
  }

  /**
   * <p>Setter for the field <code>startTime</code>.</p>
   *
   * @param startTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.CreateRun} object
   */
  public CreateRun setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>startTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStartTime() {
    return startTime;
  }

  /**
   * <p>Setter for the field <code>tags</code>.</p>
   *
   * @param tags a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.CreateRun} object
   */
  public CreateRun setTags(Collection<RunTag> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * <p>Getter for the field <code>tags</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<RunTag> getTags() {
    return tags;
  }

  /**
   * <p>Setter for the field <code>userId</code>.</p>
   *
   * @param userId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.CreateRun} object
   */
  public CreateRun setUserId(String userId) {
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
    CreateRun that = (CreateRun) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(tags, that.tags)
        && Objects.equals(userId, that.userId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(experimentId, startTime, tags, userId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateRun.class)
        .add("experimentId", experimentId)
        .add("startTime", startTime)
        .add("tags", tags)
        .add("userId", userId)
        .toString();
  }
}
