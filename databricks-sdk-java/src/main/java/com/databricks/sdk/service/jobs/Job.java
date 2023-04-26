// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Job class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Job {
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
   * The user name that the job runs as. `run_as_user_name` is based on the current job settings,
   * and is set to the creator of the job if job access control is disabled, or the `is_owner`
   * permission if job access control is enabled.
   */
  @JsonProperty("run_as_user_name")
  private String runAsUserName;

  /**
   * Settings for this job and all of its runs. These settings can be updated using the `resetJob`
   * method.
   */
  @JsonProperty("settings")
  private JobSettings settings;

  /** History of the file arrival trigger associated with the job. */
  @JsonProperty("trigger_history")
  private TriggerHistory triggerHistory;

  /**
   * <p>Setter for the field <code>createdTime</code>.</p>
   *
   * @param createdTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.Job} object
   */
  public Job setCreatedTime(Long createdTime) {
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
   * @return a {@link com.databricks.sdk.service.jobs.Job} object
   */
  public Job setCreatorUserName(String creatorUserName) {
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
   * @return a {@link com.databricks.sdk.service.jobs.Job} object
   */
  public Job setJobId(Long jobId) {
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
   * <p>Setter for the field <code>runAsUserName</code>.</p>
   *
   * @param runAsUserName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.Job} object
   */
  public Job setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  /**
   * <p>Getter for the field <code>runAsUserName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunAsUserName() {
    return runAsUserName;
  }

  /**
   * <p>Setter for the field <code>settings</code>.</p>
   *
   * @param settings a {@link com.databricks.sdk.service.jobs.JobSettings} object
   * @return a {@link com.databricks.sdk.service.jobs.Job} object
   */
  public Job setSettings(JobSettings settings) {
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

  /**
   * <p>Setter for the field <code>triggerHistory</code>.</p>
   *
   * @param triggerHistory a {@link com.databricks.sdk.service.jobs.TriggerHistory} object
   * @return a {@link com.databricks.sdk.service.jobs.Job} object
   */
  public Job setTriggerHistory(TriggerHistory triggerHistory) {
    this.triggerHistory = triggerHistory;
    return this;
  }

  /**
   * <p>Getter for the field <code>triggerHistory</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.TriggerHistory} object
   */
  public TriggerHistory getTriggerHistory() {
    return triggerHistory;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Job that = (Job) o;
    return Objects.equals(createdTime, that.createdTime)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(runAsUserName, that.runAsUserName)
        && Objects.equals(settings, that.settings)
        && Objects.equals(triggerHistory, that.triggerHistory);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        createdTime, creatorUserName, jobId, runAsUserName, settings, triggerHistory);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Job.class)
        .add("createdTime", createdTime)
        .add("creatorUserName", creatorUserName)
        .add("jobId", jobId)
        .add("runAsUserName", runAsUserName)
        .add("settings", settings)
        .add("triggerHistory", triggerHistory)
        .toString();
  }
}
