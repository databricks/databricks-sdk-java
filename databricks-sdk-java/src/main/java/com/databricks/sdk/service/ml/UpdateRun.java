// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateRun class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateRun {
  /** Unix timestamp in milliseconds of when the run ended. */
  @JsonProperty("end_time")
  private Long endTime;

  /** ID of the run to update. Must be provided. */
  @JsonProperty("run_id")
  private String runId;

  /**
   * [Deprecated, use run_id instead] ID of the run to update.. This field will be removed in a
   * future MLflow version.
   */
  @JsonProperty("run_uuid")
  private String runUuid;

  /** Updated status of the run. */
  @JsonProperty("status")
  private UpdateRunStatus status;

  /**
   * <p>Setter for the field <code>endTime</code>.</p>
   *
   * @param endTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateRun} object
   */
  public UpdateRun setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>endTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getEndTime() {
    return endTime;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateRun} object
   */
  public UpdateRun setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * <p>Getter for the field <code>runId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunId() {
    return runId;
  }

  /**
   * <p>Setter for the field <code>runUuid</code>.</p>
   *
   * @param runUuid a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateRun} object
   */
  public UpdateRun setRunUuid(String runUuid) {
    this.runUuid = runUuid;
    return this;
  }

  /**
   * <p>Getter for the field <code>runUuid</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunUuid() {
    return runUuid;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.ml.UpdateRunStatus} object
   * @return a {@link com.databricks.sdk.service.ml.UpdateRun} object
   */
  public UpdateRun setStatus(UpdateRunStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.UpdateRunStatus} object
   */
  public UpdateRunStatus getStatus() {
    return status;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRun that = (UpdateRun) o;
    return Objects.equals(endTime, that.endTime)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runUuid, that.runUuid)
        && Objects.equals(status, that.status);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(endTime, runId, runUuid, status);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateRun.class)
        .add("endTime", endTime)
        .add("runId", runId)
        .add("runUuid", runUuid)
        .add("status", status)
        .toString();
  }
}
