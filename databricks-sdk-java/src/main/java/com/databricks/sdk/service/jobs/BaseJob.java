// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>BaseJob class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class BaseJob {
  /**
   * The time at which this job was created in epoch milliseconds (milliseconds since 1/1/1970 UTC).
   */
  @JsonProperty("created_time")
  private Long createdTime;

  /**
   * The creator user name. This field won’t be included in the response if the user has already
   * been deleted.
   */
  @JsonProperty("creator_user_name")
  private String creatorUserName;

  /** The canonical identifier for this job. */
  @JsonProperty("job_id")
  private Long jobId;

  /**
   * Settings for this job and all of its runs. These settings can be updated using the `resetJob`
   * method.
   */
  @JsonProperty("settings")
  private JobSettings settings;

  /**
   * <p>Setter for the field <code>createdTime</code>.</p>
   *
   * @param createdTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.BaseJob} object
   */
  public BaseJob setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreatedTime() {
    return createdTime;
  }

  /**
   * <p>Setter for the field <code>creatorUserName</code>.</p>
   *
   * @param creatorUserName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.BaseJob} object
   */
  public BaseJob setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  /**
   * <p>Getter for the field <code>creatorUserName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatorUserName() {
    return creatorUserName;
  }

  /**
   * <p>Setter for the field <code>jobId</code>.</p>
   *
   * @param jobId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.BaseJob} object
   */
  public BaseJob setJobId(Long jobId) {
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
   * <p>Setter for the field <code>settings</code>.</p>
   *
   * @param settings a {@link com.databricks.sdk.service.jobs.JobSettings} object
   * @return a {@link com.databricks.sdk.service.jobs.BaseJob} object
   */
  public BaseJob setSettings(JobSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * <p>Getter for the field <code>settings</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public JobSettings getSettings() {
    return settings;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BaseJob that = (BaseJob) o;
    return Objects.equals(createdTime, that.createdTime)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(settings, that.settings);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(createdTime, creatorUserName, jobId, settings);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(BaseJob.class)
        .add("createdTime", createdTime)
        .add("creatorUserName", creatorUserName)
        .add("jobId", jobId)
        .add("settings", settings)
        .toString();
  }
}
