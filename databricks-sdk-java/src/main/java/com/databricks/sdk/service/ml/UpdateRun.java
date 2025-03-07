// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateRun {
  /** Unix timestamp in milliseconds of when the run ended. */
  @JsonProperty("end_time")
  private Long endTime;

  /** ID of the run to update. Must be provided. */
  @JsonProperty("run_id")
  private String runId;

  /** Updated name of the run. */
  @JsonProperty("run_name")
  private String runName;

  /**
   * [Deprecated, use `run_id` instead] ID of the run to update. This field will be removed in a
   * future MLflow version.
   */
  @JsonProperty("run_uuid")
  private String runUuid;

  /** Updated status of the run. */
  @JsonProperty("status")
  private UpdateRunStatus status;

  public UpdateRun setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public UpdateRun setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public UpdateRun setRunName(String runName) {
    this.runName = runName;
    return this;
  }

  public String getRunName() {
    return runName;
  }

  public UpdateRun setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  public String getRunUuid() {
    return runUuid;
  }

  public UpdateRun setStatus(UpdateRunStatus status) {
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
    UpdateRun that = (UpdateRun) o;
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
    return new ToStringer(UpdateRun.class)
        .add("endTime", endTime)
        .add("runId", runId)
        .add("runName", runName)
        .add("runUuid", runUuid)
        .add("status", status)
        .toString();
  }
}
