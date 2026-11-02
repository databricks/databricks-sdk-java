// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class JobCompletionTriggerStateMonitoredJobState {
  /** Whether this job has contributed a matching completion toward the next trigger fire. */
  @JsonProperty("has_seen_completion")
  private Boolean hasSeenCompletion;

  /**
   * Whether the upstream job was missing or deleted when last observed by this trigger. Omitted
   * when deletion status is unknown. This observation may become stale while the trigger is paused
   * or evaluation cannot access the upstream job.
   */
  @JsonProperty("is_deleted")
  private Boolean isDeleted;

  /** The ID of the upstream job. */
  @JsonProperty("job_id")
  private String jobId;

  /** The completion time of the latest matching upstream run observed by the trigger. */
  @JsonProperty("last_seen_completion_time")
  private Timestamp lastSeenCompletionTime;

  /** The termination code of the latest matching upstream run observed by the trigger. */
  @JsonProperty("last_seen_result")
  private TerminationCodeCode lastSeenResult;

  /** The ID of the latest matching upstream run observed by the trigger. */
  @JsonProperty("last_seen_run_id")
  private String lastSeenRunId;

  /**
   * The termination code of the latest upstream run if it does not satisfy `if_status`. Unset when
   * the latest run matches or no run has been observed.
   */
  @JsonProperty("latest_non_matching_result")
  private TerminationCodeCode latestNonMatchingResult;

  /** The ID of the workspace containing the upstream job. */
  @JsonProperty("workspace_id")
  private String workspaceId;

  public JobCompletionTriggerStateMonitoredJobState setHasSeenCompletion(
      Boolean hasSeenCompletion) {
    this.hasSeenCompletion = hasSeenCompletion;
    return this;
  }

  public Boolean getHasSeenCompletion() {
    return hasSeenCompletion;
  }

  public JobCompletionTriggerStateMonitoredJobState setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public JobCompletionTriggerStateMonitoredJobState setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public JobCompletionTriggerStateMonitoredJobState setLastSeenCompletionTime(
      Timestamp lastSeenCompletionTime) {
    this.lastSeenCompletionTime = lastSeenCompletionTime;
    return this;
  }

  public Timestamp getLastSeenCompletionTime() {
    return lastSeenCompletionTime;
  }

  public JobCompletionTriggerStateMonitoredJobState setLastSeenResult(
      TerminationCodeCode lastSeenResult) {
    this.lastSeenResult = lastSeenResult;
    return this;
  }

  public TerminationCodeCode getLastSeenResult() {
    return lastSeenResult;
  }

  public JobCompletionTriggerStateMonitoredJobState setLastSeenRunId(String lastSeenRunId) {
    this.lastSeenRunId = lastSeenRunId;
    return this;
  }

  public String getLastSeenRunId() {
    return lastSeenRunId;
  }

  public JobCompletionTriggerStateMonitoredJobState setLatestNonMatchingResult(
      TerminationCodeCode latestNonMatchingResult) {
    this.latestNonMatchingResult = latestNonMatchingResult;
    return this;
  }

  public TerminationCodeCode getLatestNonMatchingResult() {
    return latestNonMatchingResult;
  }

  public JobCompletionTriggerStateMonitoredJobState setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public String getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobCompletionTriggerStateMonitoredJobState that =
        (JobCompletionTriggerStateMonitoredJobState) o;
    return Objects.equals(hasSeenCompletion, that.hasSeenCompletion)
        && Objects.equals(isDeleted, that.isDeleted)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(lastSeenCompletionTime, that.lastSeenCompletionTime)
        && Objects.equals(lastSeenResult, that.lastSeenResult)
        && Objects.equals(lastSeenRunId, that.lastSeenRunId)
        && Objects.equals(latestNonMatchingResult, that.latestNonMatchingResult)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hasSeenCompletion,
        isDeleted,
        jobId,
        lastSeenCompletionTime,
        lastSeenResult,
        lastSeenRunId,
        latestNonMatchingResult,
        workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(JobCompletionTriggerStateMonitoredJobState.class)
        .add("hasSeenCompletion", hasSeenCompletion)
        .add("isDeleted", isDeleted)
        .add("jobId", jobId)
        .add("lastSeenCompletionTime", lastSeenCompletionTime)
        .add("lastSeenResult", lastSeenResult)
        .add("lastSeenRunId", lastSeenRunId)
        .add("latestNonMatchingResult", latestNonMatchingResult)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
