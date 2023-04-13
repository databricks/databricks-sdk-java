// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

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

  public UpdateJob setFieldsToRemove(Collection<String> fieldsToRemove) {
    this.fieldsToRemove = fieldsToRemove;
    return this;
  }

  public Collection<String> getFieldsToRemove() {
    return fieldsToRemove;
  }

  public UpdateJob setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public UpdateJob setNewSettings(JobSettings newSettings) {
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
    UpdateJob that = (UpdateJob) o;
    return Objects.equals(fieldsToRemove, that.fieldsToRemove)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(newSettings, that.newSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldsToRemove, jobId, newSettings);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateJob.class)
        .add("fieldsToRemove", fieldsToRemove)
        .add("jobId", jobId)
        .add("newSettings", newSettings)
        .toString();
  }
}
