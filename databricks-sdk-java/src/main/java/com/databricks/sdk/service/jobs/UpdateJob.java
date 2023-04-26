// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>UpdateJob class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateJob {
  /**
   * Remove top-level fields in the job settings. Removing nested fields is not supported. This
   * field is optional.
   */
  @JsonProperty("fields_to_remove")
  private Collection<String> fieldsToRemove;

  /** The canonical identifier of the job to update. This field is required. */
  @JsonProperty("job_id")
  private Long jobId;

  /**
   * The new settings for the job. Any top-level fields specified in `new_settings` are completely
   * replaced. Partially updating nested fields is not supported.
   *
   * <p>Changes to the field `JobSettings.timeout_seconds` are applied to active runs. Changes to
   * other fields are applied to future runs only.
   */
  @JsonProperty("new_settings")
  private JobSettings newSettings;

  /**
   * <p>Setter for the field <code>fieldsToRemove</code>.</p>
   *
   * @param fieldsToRemove a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.UpdateJob} object
   */
  public UpdateJob setFieldsToRemove(Collection<String> fieldsToRemove) {
    this.fieldsToRemove = fieldsToRemove;
    return this;
  }

  /**
   * <p>Getter for the field <code>fieldsToRemove</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getFieldsToRemove() {
    return fieldsToRemove;
  }

  /**
   * <p>Setter for the field <code>jobId</code>.</p>
   *
   * @param jobId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.UpdateJob} object
   */
  public UpdateJob setJobId(Long jobId) {
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
   * @return a {@link com.databricks.sdk.service.jobs.UpdateJob} object
   */
  public UpdateJob setNewSettings(JobSettings newSettings) {
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
    UpdateJob that = (UpdateJob) o;
    return Objects.equals(fieldsToRemove, that.fieldsToRemove)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(newSettings, that.newSettings);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(fieldsToRemove, jobId, newSettings);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateJob.class)
        .add("fieldsToRemove", fieldsToRemove)
        .add("jobId", jobId)
        .add("newSettings", newSettings)
        .toString();
  }
}
