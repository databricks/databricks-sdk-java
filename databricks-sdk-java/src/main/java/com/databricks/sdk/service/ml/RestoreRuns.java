// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RestoreRuns {
  /** The ID of the experiment containing the runs to restore. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /**
   * An optional positive integer indicating the maximum number of runs to restore. The maximum
   * allowed value for max_runs is 10000.
   */
  @JsonProperty("max_runs")
  private Long maxRuns;

  /**
   * The minimum deletion timestamp in milliseconds since the UNIX epoch for restoring runs. Only
   * runs deleted no earlier than this timestamp are restored.
   */
  @JsonProperty("min_timestamp_millis")
  private Long minTimestampMillis;

  public RestoreRuns setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public RestoreRuns setMaxRuns(Long maxRuns) {
    this.maxRuns = maxRuns;
    return this;
  }

  public Long getMaxRuns() {
    return maxRuns;
  }

  public RestoreRuns setMinTimestampMillis(Long minTimestampMillis) {
    this.minTimestampMillis = minTimestampMillis;
    return this;
  }

  public Long getMinTimestampMillis() {
    return minTimestampMillis;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestoreRuns that = (RestoreRuns) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(maxRuns, that.maxRuns)
        && Objects.equals(minTimestampMillis, that.minTimestampMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, maxRuns, minTimestampMillis);
  }

  @Override
  public String toString() {
    return new ToStringer(RestoreRuns.class)
        .add("experimentId", experimentId)
        .add("maxRuns", maxRuns)
        .add("minTimestampMillis", minTimestampMillis)
        .toString();
  }
}
