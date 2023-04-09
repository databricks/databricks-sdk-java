// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ResetJob {
  /** The canonical identifier of the job to reset. This field is required. */
  @JsonProperty("job_id")
  private Long jobId;

  /**
   * The new settings of the job. These settings completely replace the old settings.
   *
   * <p>Changes to the field `JobSettings.timeout_seconds` are applied to active runs. Changes to
   * other fields are applied to future runs only.
   */
  @JsonProperty("new_settings")
  private JobSettings newSettings;

  public ResetJob setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public ResetJob setNewSettings(JobSettings newSettings) {
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
    ResetJob that = (ResetJob) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(newSettings, that.newSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, newSettings);
  }

  @Override
  public String toString() {
    return new ToStringer(ResetJob.class)
        .add("jobId", jobId)
        .add("newSettings", newSettings)
        .toString();
  }
}
