// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DeleteRunsPb {
  @JsonProperty("experiment_id")
  private String experimentId;

  @JsonProperty("max_runs")
  private Long maxRuns;

  @JsonProperty("max_timestamp_millis")
  private Long maxTimestampMillis;

  public DeleteRunsPb setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public DeleteRunsPb setMaxRuns(Long maxRuns) {
    this.maxRuns = maxRuns;
    return this;
  }

  public Long getMaxRuns() {
    return maxRuns;
  }

  public DeleteRunsPb setMaxTimestampMillis(Long maxTimestampMillis) {
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
    DeleteRunsPb that = (DeleteRunsPb) o;
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
    return new ToStringer(DeleteRunsPb.class)
        .add("experimentId", experimentId)
        .add("maxRuns", maxRuns)
        .add("maxTimestampMillis", maxTimestampMillis)
        .toString();
  }
}
