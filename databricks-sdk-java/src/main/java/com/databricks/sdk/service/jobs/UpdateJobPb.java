// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class UpdateJobPb {
  @JsonProperty("fields_to_remove")
  private Collection<String> fieldsToRemove;

  @JsonProperty("job_id")
  private Long jobId;

  @JsonProperty("new_settings")
  private JobSettings newSettings;

  public UpdateJobPb setFieldsToRemove(Collection<String> fieldsToRemove) {
    this.fieldsToRemove = fieldsToRemove;
    return this;
  }

  public Collection<String> getFieldsToRemove() {
    return fieldsToRemove;
  }

  public UpdateJobPb setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public UpdateJobPb setNewSettings(JobSettings newSettings) {
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
    UpdateJobPb that = (UpdateJobPb) o;
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
    return new ToStringer(UpdateJobPb.class)
        .add("fieldsToRemove", fieldsToRemove)
        .add("jobId", jobId)
        .add("newSettings", newSettings)
        .toString();
  }
}
