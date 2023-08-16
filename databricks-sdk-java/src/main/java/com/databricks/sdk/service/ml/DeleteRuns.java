// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DeleteRuns {
  /** The ID of the experiment containing the runs to delete. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /**
   * An optional positive integer indicating the maximum number of runs to delete. The maximum
   * allowed value for max_runs is 10000.
   */
  @JsonProperty("max_runs")
  private Long maxRuns;

  /**
   * The maximum creation timestamp in milliseconds since the UNIX epoch for deleting runs. Only
   * runs created prior to or at this timestamp are deleted.
   */
  @JsonProperty("max_timestamp_millis")
  private Long maxTimestampMillis;

  public DeleteRuns setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public DeleteRuns setMaxRuns(Long maxRuns) {
    this.maxRuns = maxRuns;
    return this;
  }

  public Long getMaxRuns() {
    return maxRuns;
  }

  public DeleteRuns setMaxTimestampMillis(Long maxTimestampMillis) {
    this.maxTimestampMillis = maxTimestampMillis;
    return this;
  }

  public Long getMaxTimestampMillis() {
    return maxTimestampMillis;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteRuns that = (DeleteRuns) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(maxRuns, that.maxRuns)
        && Objects.equals(maxTimestampMillis, that.maxTimestampMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, maxRuns, maxTimestampMillis);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRuns.class)
        .add("experimentId", experimentId)
        .add("maxRuns", maxRuns)
        .add("maxTimestampMillis", maxTimestampMillis)
        .toString();
  }
}
