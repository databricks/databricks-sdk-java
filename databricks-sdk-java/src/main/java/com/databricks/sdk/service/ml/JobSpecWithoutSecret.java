// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class JobSpecWithoutSecret {
  /** ID of the job that the webhook runs. */
  @JsonProperty("job_id")
  private String jobId;

  /**
   * URL of the workspace containing the job that this webhook runs. If not specified, the job’s
   * workspace URL is assumed to be the same as the workspace where the webhook is created.
   */
  @JsonProperty("workspace_url")
  private String workspaceUrl;

  public JobSpecWithoutSecret setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public JobSpecWithoutSecret setWorkspaceUrl(String workspaceUrl) {
    this.workspaceUrl = workspaceUrl;
    return this;
  }

  public String getWorkspaceUrl() {
    return workspaceUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobSpecWithoutSecret that = (JobSpecWithoutSecret) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(workspaceUrl, that.workspaceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, workspaceUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(JobSpecWithoutSecret.class)
        .add("jobId", jobId)
        .add("workspaceUrl", workspaceUrl)
        .toString();
  }
}
