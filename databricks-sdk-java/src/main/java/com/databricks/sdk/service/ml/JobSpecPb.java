// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class JobSpecPb {
  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("job_id")
  private String jobId;

  @JsonProperty("workspace_url")
  private String workspaceUrl;

  public JobSpecPb setAccessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public JobSpecPb setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public JobSpecPb setWorkspaceUrl(String workspaceUrl) {
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
    JobSpecPb that = (JobSpecPb) o;
    return Objects.equals(accessToken, that.accessToken)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(workspaceUrl, that.workspaceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, jobId, workspaceUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(JobSpecPb.class)
        .add("accessToken", accessToken)
        .add("jobId", jobId)
        .add("workspaceUrl", workspaceUrl)
        .toString();
  }
}
