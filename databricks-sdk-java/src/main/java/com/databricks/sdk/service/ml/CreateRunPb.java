// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreateRunPb {
  @JsonProperty("experiment_id")
  private String experimentId;

  @JsonProperty("run_name")
  private String runName;

  @JsonProperty("start_time")
  private Long startTime;

  @JsonProperty("tags")
  private Collection<RunTag> tags;

  @JsonProperty("user_id")
  private String userId;

  public CreateRunPb setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public CreateRunPb setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public CreateRunPb setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public CreateRunPb setTags(Collection<RunTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<RunTag> getTags() {
    return tags;
  }

  public CreateRunPb setUserId(String userId) {
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
    CreateRunPb that = (CreateRunPb) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(runName, that.runName)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(tags, that.tags)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, runName, startTime, tags, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRunPb.class)
        .add("experimentId", experimentId)
        .add("runName", runName)
        .add("startTime", startTime)
        .add("tags", tags)
        .add("userId", userId)
        .toString();
  }
}
