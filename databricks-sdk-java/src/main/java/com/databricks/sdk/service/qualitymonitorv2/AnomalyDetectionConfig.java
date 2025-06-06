// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AnomalyDetectionConfig {
  /** Run id of the last run of the workflow */
  @JsonProperty("last_run_id")
  private String lastRunId;

  /** The status of the last run of the workflow. */
  @JsonProperty("latest_run_status")
  private AnomalyDetectionRunStatus latestRunStatus;

  public AnomalyDetectionConfig setLastRunId(String lastRunId) {
    this.lastRunId = lastRunId;
    return this;
  }

  public String getLastRunId() {
    return lastRunId;
  }

  public AnomalyDetectionConfig setLatestRunStatus(AnomalyDetectionRunStatus latestRunStatus) {
    this.latestRunStatus = latestRunStatus;
    return this;
  }

  public AnomalyDetectionRunStatus getLatestRunStatus() {
    return latestRunStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnomalyDetectionConfig that = (AnomalyDetectionConfig) o;
    return Objects.equals(lastRunId, that.lastRunId)
        && Objects.equals(latestRunStatus, that.latestRunStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastRunId, latestRunStatus);
  }

  @Override
  public String toString() {
    return new ToStringer(AnomalyDetectionConfig.class)
        .add("lastRunId", lastRunId)
        .add("latestRunStatus", latestRunStatus)
        .toString();
  }
}
