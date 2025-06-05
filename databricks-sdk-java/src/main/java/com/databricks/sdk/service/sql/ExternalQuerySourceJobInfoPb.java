// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ExternalQuerySourceJobInfoPb {
  @JsonProperty("job_id")
  private String jobId;

  @JsonProperty("job_run_id")
  private String jobRunId;

  @JsonProperty("job_task_run_id")
  private String jobTaskRunId;

  public ExternalQuerySourceJobInfoPb setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public ExternalQuerySourceJobInfoPb setJobRunId(String jobRunId) {
    this.jobRunId = jobRunId;
    return this;
  }

  public String getJobRunId() {
    return jobRunId;
  }

  public ExternalQuerySourceJobInfoPb setJobTaskRunId(String jobTaskRunId) {
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
    ExternalQuerySourceJobInfoPb that = (ExternalQuerySourceJobInfoPb) o;
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
    return new ToStringer(ExternalQuerySourceJobInfoPb.class)
        .add("jobId", jobId)
        .add("jobRunId", jobRunId)
        .add("jobTaskRunId", jobTaskRunId)
        .toString();
  }
}
