// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ResetJobPb {
  @JsonProperty("job_id")
  private Long jobId;

  @JsonProperty("new_settings")
  private JobSettings newSettings;

  public ResetJobPb setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public ResetJobPb setNewSettings(JobSettings newSettings) {
    this.newSettings = newSettings;
    return this;
  }

  public JobSettings getNewSettings() {
    return newSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResetJobPb that = (ResetJobPb) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(newSettings, that.newSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, newSettings);
  }

  @Override
  public String toString() {
    return new ToStringer(ResetJobPb.class)
        .add("jobId", jobId)
        .add("newSettings", newSettings)
        .toString();
  }
}
