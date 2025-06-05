// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateRunPb {
  @JsonProperty("end_time")
  private Long endTime;

  @JsonProperty("run_id")
  private String runId;

  @JsonProperty("run_name")
  private String runName;

  @JsonProperty("run_uuid")
  private String runUuid;

  @JsonProperty("status")
  private UpdateRunStatus status;

  public UpdateRunPb setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public UpdateRunPb setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public UpdateRunPb setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public UpdateRunPb setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  public UpdateRunPb setStatus(UpdateRunStatus status) {
    this.status = status;
    return this;
  }

  public UpdateRunStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRunPb that = (UpdateRunPb) o;
    return Objects.equals(endTime, that.endTime)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runName, that.runName)
        && Objects.equals(runUuid, that.runUuid)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, runId, runName, runUuid, status);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRunPb.class)
        .add("endTime", endTime)
        .add("runId", runId)
        .add("runName", runName)
        .add("runUuid", runUuid)
        .add("status", status)
        .toString();
  }
}
