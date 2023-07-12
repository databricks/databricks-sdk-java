// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RunJobTask {
  /** ID of the job to trigger. */
  @JsonProperty("job_id")
  private Long jobId;

  /** Job-level parameters used to trigger the job. */
  @JsonProperty("job_parameters")
  private Object jobParameters;

  public RunJobTask setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public RunJobTask setJobParameters(Object jobParameters) {
    this.jobParameters = jobParameters;
    return this;
  }

  public Object getJobParameters() {
    return jobParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunJobTask that = (RunJobTask) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(jobParameters, that.jobParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, jobParameters);
  }

  @Override
  public String toString() {
    return new ToStringer(RunJobTask.class)
        .add("jobId", jobId)
        .add("jobParameters", jobParameters)
        .toString();
  }
}
