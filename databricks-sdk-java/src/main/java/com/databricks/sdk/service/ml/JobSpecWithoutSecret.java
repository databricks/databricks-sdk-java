// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>JobSpecWithoutSecret class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class JobSpecWithoutSecret {
  /** ID of the job that the webhook runs. */
  @JsonProperty("job_id")
  private String jobId;

  /**
   * URL of the workspace containing the job that this webhook runs. Defaults to the workspace URL
   * in which the webhook is created. If not specified, the job’s workspace is assumed to be the
   * same as the webhook’s.
   */
  @JsonProperty("workspace_url")
  private String workspaceUrl;

  /**
   * <p>Setter for the field <code>jobId</code>.</p>
   *
   * @param jobId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.JobSpecWithoutSecret} object
   */
  public JobSpecWithoutSecret setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getJobId() {
    return jobId;
  }

  /**
   * <p>Setter for the field <code>workspaceUrl</code>.</p>
   *
   * @param workspaceUrl a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.JobSpecWithoutSecret} object
   */
  public JobSpecWithoutSecret setWorkspaceUrl(String workspaceUrl) {
    this.workspaceUrl = workspaceUrl;
    return this;
  }

  /**
   * <p>Getter for the field <code>workspaceUrl</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWorkspaceUrl() {
    return workspaceUrl;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobSpecWithoutSecret that = (JobSpecWithoutSecret) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(workspaceUrl, that.workspaceUrl);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(jobId, workspaceUrl);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(JobSpecWithoutSecret.class)
        .add("jobId", jobId)
        .add("workspaceUrl", workspaceUrl)
        .toString();
  }
}
