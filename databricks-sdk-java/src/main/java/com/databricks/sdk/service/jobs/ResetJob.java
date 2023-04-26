// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ResetJob class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>jobId</code>.</p>
   *
   * @param jobId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.ResetJob} object
   */
  public ResetJob setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * <p>Getter for the field <code>jobId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getJobId() {
    return jobId;
  }

  /**
   * <p>Setter for the field <code>newSettings</code>.</p>
   *
   * @param newSettings a {@link com.databricks.sdk.service.jobs.JobSettings} object
   * @return a {@link com.databricks.sdk.service.jobs.ResetJob} object
   */
  public ResetJob setNewSettings(JobSettings newSettings) {
    this.newSettings = newSettings;
    return this;
  }

  /**
   * <p>Getter for the field <code>newSettings</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings getNewSettings() {
    return newSettings;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResetJob that = (ResetJob) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(newSettings, that.newSettings);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(jobId, newSettings);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ResetJob.class)
        .add("jobId", jobId)
        .add("newSettings", newSettings)
        .toString();
  }
}
