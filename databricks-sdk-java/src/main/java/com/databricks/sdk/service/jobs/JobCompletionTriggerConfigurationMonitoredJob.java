// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** An upstream job to monitor. */
@Generated
public class JobCompletionTriggerConfigurationMonitoredJob {
  /** The ID of the upstream job. */
  @JsonProperty("job_id")
  private String jobId;

  /**
   * The ID of the workspace containing the upstream job. This can differ from the caller's
   * workspace and downstream services enforce correct entitlements and CAN_VIEW permissions for the
   * user + job combination. SDR: https://databricks.atlassian.net/browse/SDR-5267
   */
  @JsonProperty("workspace_id")
  private String workspaceId;

  public JobCompletionTriggerConfigurationMonitoredJob setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public JobCompletionTriggerConfigurationMonitoredJob setWorkspaceId(String workspaceId) {
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
    JobCompletionTriggerConfigurationMonitoredJob that =
        (JobCompletionTriggerConfigurationMonitoredJob) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(JobCompletionTriggerConfigurationMonitoredJob.class)
        .add("jobId", jobId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
