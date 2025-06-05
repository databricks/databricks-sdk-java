// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RestoreRunsPb {
  @JsonProperty("experiment_id")
  private String experimentId;

  @JsonProperty("max_runs")
  private Long maxRuns;

  @JsonProperty("min_timestamp_millis")
  private Long minTimestampMillis;

  public RestoreRunsPb setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public RestoreRunsPb setMaxRuns(Long maxRuns) {
    this.maxRuns = maxRuns;
    return this;
  }

  public Long getMaxRuns() {
    return maxRuns;
  }

  public RestoreRunsPb setMinTimestampMillis(Long minTimestampMillis) {
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
    RestoreRunsPb that = (RestoreRunsPb) o;
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
    return new ToStringer(RestoreRunsPb.class)
        .add("experimentId", experimentId)
        .add("maxRuns", maxRuns)
        .add("minTimestampMillis", minTimestampMillis)
        .toString();
  }
}
