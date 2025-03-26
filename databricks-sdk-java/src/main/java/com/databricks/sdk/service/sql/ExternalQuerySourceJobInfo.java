// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ExternalQuerySourceJobInfo {
  /** The canonical identifier for this job. */
  @JsonProperty("job_id")
  private String jobId;

  /** The canonical identifier of the run. This ID is unique across all runs of all jobs. */
  @JsonProperty("job_run_id")
  private String jobRunId;

  /** The canonical identifier of the task run. */
  @JsonProperty("job_task_run_id")
  private String jobTaskRunId;

  public ExternalQuerySourceJobInfo setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public ExternalQuerySourceJobInfo setJobRunId(String jobRunId) {
    this.jobRunId = jobRunId;
    return this;
  }

  public String getJobRunId() {
    return jobRunId;
  }

  public ExternalQuerySourceJobInfo setJobTaskRunId(String jobTaskRunId) {
    this.jobTaskRunId = jobTaskRunId;
    return this;
  }

  public String getJobTaskRunId() {
    return jobTaskRunId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalQuerySourceJobInfo that = (ExternalQuerySourceJobInfo) o;
    return Objects.equals(jobId, that.jobId)
        && Objects.equals(jobRunId, that.jobRunId)
        && Objects.equals(jobTaskRunId, that.jobTaskRunId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, jobRunId, jobTaskRunId);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalQuerySourceJobInfo.class)
        .add("jobId", jobId)
        .add("jobRunId", jobRunId)
        .add("jobTaskRunId", jobTaskRunId)
        .toString();
  }
}
