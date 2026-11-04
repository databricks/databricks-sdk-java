// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * Read-only runtime status of one job or pipeline backing a resource.
 *
 * <p>Shared across resources: a Rule's single job, a Datasource's main / health /
 * historical-ingestion jobs, and a Datasource's ingestion pipeline (the `pipeline_id` field is set
 * only for the pipeline). For a datasource's historical ingestion, the shard count is simply the
 * number of `historical_job_statuses` entries — there is no separate count field.
 *
 * <p>Two orthogonal axes are modeled separately (v1 conflated them into a single `jobStatus` enum):
 * `lifecycle` (is it configured / does it still exist) and `run_state` (what the most recent or
 * in-flight run did).
 *
 * <p>Every field that holds a `ResourceStatus` is OUTPUT_ONLY at its use site (Datasource
 * ingest/health/historical/pipeline statuses, Rule status), so the inner fields don't repeat the
 * annotation.
 */
@Generated
public class ResourceStatus {
  /** */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Databricks Jobs API job ID. Unset for a pure ingestion pipeline. */
  @JsonProperty("job_id")
  private String jobId;

  /** When the most recent run completed. Pairs with `run_state = SUCCEEDED`. */
  @JsonProperty("last_complete_time")
  private Timestamp lastCompleteTime;

  /** Most recent error message, if any. Pairs with `run_state = FAILED`. */
  @JsonProperty("last_error_message")
  private String lastErrorMessage;

  /** When the most recent run started. Pairs with `run_state = RUNNING`. */
  @JsonProperty("last_start_time")
  private Timestamp lastStartTime;

  /** */
  @JsonProperty("last_status_change_time")
  private Timestamp lastStatusChangeTime;

  /**
   * Scheduling lifecycle of the resource's underlying job/pipeline: whether it is unscheduled,
   * scheduled, stopped, or deleted. Distinct from `run_state`, which reports the outcome of the
   * most recent run.
   */
  @JsonProperty("lifecycle_state")
  private ResourceStatusLifecycle lifecycleState;

  /**
   * DLT ingestion-pipeline ID. Set only when this status represents the datasource's ingestion
   * pipeline (unset for job statuses).
   */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /** */
  @JsonProperty("run_state")
  private ResourceStatusRunState runState;

  public ResourceStatus setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public ResourceStatus setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public ResourceStatus setLastCompleteTime(Timestamp lastCompleteTime) {
    this.lastCompleteTime = lastCompleteTime;
    return this;
  }

  public Timestamp getLastCompleteTime() {
    return lastCompleteTime;
  }

  public ResourceStatus setLastErrorMessage(String lastErrorMessage) {
    this.lastErrorMessage = lastErrorMessage;
    return this;
  }

  public String getLastErrorMessage() {
    return lastErrorMessage;
  }

  public ResourceStatus setLastStartTime(Timestamp lastStartTime) {
    this.lastStartTime = lastStartTime;
    return this;
  }

  public Timestamp getLastStartTime() {
    return lastStartTime;
  }

  public ResourceStatus setLastStatusChangeTime(Timestamp lastStatusChangeTime) {
    this.lastStatusChangeTime = lastStatusChangeTime;
    return this;
  }

  public Timestamp getLastStatusChangeTime() {
    return lastStatusChangeTime;
  }

  public ResourceStatus setLifecycleState(ResourceStatusLifecycle lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public ResourceStatusLifecycle getLifecycleState() {
    return lifecycleState;
  }

  public ResourceStatus setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public ResourceStatus setRunState(ResourceStatusRunState runState) {
    this.runState = runState;
    return this;
  }

  public ResourceStatusRunState getRunState() {
    return runState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourceStatus that = (ResourceStatus) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(lastCompleteTime, that.lastCompleteTime)
        && Objects.equals(lastErrorMessage, that.lastErrorMessage)
        && Objects.equals(lastStartTime, that.lastStartTime)
        && Objects.equals(lastStatusChangeTime, that.lastStatusChangeTime)
        && Objects.equals(lifecycleState, that.lifecycleState)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(runState, that.runState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        jobId,
        lastCompleteTime,
        lastErrorMessage,
        lastStartTime,
        lastStatusChangeTime,
        lifecycleState,
        pipelineId,
        runState);
  }

  @Override
  public String toString() {
    return new ToStringer(ResourceStatus.class)
        .add("createTime", createTime)
        .add("jobId", jobId)
        .add("lastCompleteTime", lastCompleteTime)
        .add("lastErrorMessage", lastErrorMessage)
        .add("lastStartTime", lastStartTime)
        .add("lastStatusChangeTime", lastStatusChangeTime)
        .add("lifecycleState", lifecycleState)
        .add("pipelineId", pipelineId)
        .add("runState", runState)
        .toString();
  }
}
