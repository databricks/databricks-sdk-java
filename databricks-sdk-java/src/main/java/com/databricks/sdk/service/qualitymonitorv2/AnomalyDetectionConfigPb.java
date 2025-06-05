// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AnomalyDetectionConfigPb {
  @JsonProperty("last_run_id")
  private String lastRunId;

  @JsonProperty("latest_run_status")
  private AnomalyDetectionRunStatus latestRunStatus;

  public AnomalyDetectionConfigPb setLastRunId(String lastRunId) {
    this.lastRunId = lastRunId;
    return this;
  }

  public String getLastRunId() {
    return lastRunId;
  }

  public AnomalyDetectionConfigPb setLatestRunStatus(AnomalyDetectionRunStatus latestRunStatus) {
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
    AnomalyDetectionConfigPb that = (AnomalyDetectionConfigPb) o;
    return Objects.equals(lastRunId, that.lastRunId)
        && Objects.equals(latestRunStatus, that.latestRunStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastRunId, latestRunStatus);
  }

  @Override
  public String toString() {
    return new ToStringer(AnomalyDetectionConfigPb.class)
        .add("lastRunId", lastRunId)
        .add("latestRunStatus", latestRunStatus)
        .toString();
  }
}
