// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** A single upstream completion that contributed to triggering the run, captured at trigger time */
@Generated
public class CompletedJob {
  /** The completion time of the upstream run */
  @JsonProperty("completion_time")
  private Timestamp completionTime;

  /** The ID of the upstream job */
  @JsonProperty("job_id")
  private String jobId;

  /** The ID of the upstream run whose completion contributed to the trigger */
  @JsonProperty("run_id")
  private String runId;

  /** The termination code of the upstream run */
  @JsonProperty("termination_code")
  private TerminationCodeCode terminationCode;

  /** The ID of the workspace containing the upstream job */
  @JsonProperty("workspace_id")
  private String workspaceId;

  public CompletedJob setCompletionTime(Timestamp completionTime) {
    this.completionTime = completionTime;
    return this;
  }

  public Timestamp getCompletionTime() {
    return completionTime;
  }

  public CompletedJob setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public CompletedJob setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public CompletedJob setTerminationCode(TerminationCodeCode terminationCode) {
    this.terminationCode = terminationCode;
    return this;
  }

  public TerminationCodeCode getTerminationCode() {
    return terminationCode;
  }

  public CompletedJob setWorkspaceId(String workspaceId) {
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
    CompletedJob that = (CompletedJob) o;
    return Objects.equals(completionTime, that.completionTime)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(runId, that.runId)
        && Objects.equals(terminationCode, that.terminationCode)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTime, jobId, runId, terminationCode, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(CompletedJob.class)
        .add("completionTime", completionTime)
        .add("jobId", jobId)
        .add("runId", runId)
        .add("terminationCode", terminationCode)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
