// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class EnforcePolicyComplianceResponsePb {
  @JsonProperty("has_changes")
  private Boolean hasChanges;

  @JsonProperty("job_cluster_changes")
  private Collection<EnforcePolicyComplianceForJobResponseJobClusterSettingsChange>
      jobClusterChanges;

  @JsonProperty("settings")
  private JobSettings settings;

  public EnforcePolicyComplianceResponsePb setHasChanges(Boolean hasChanges) {
    this.hasChanges = hasChanges;
    return this;
  }

  public Boolean getHasChanges() {
    return hasChanges;
  }

  public EnforcePolicyComplianceResponsePb setJobClusterChanges(
      Collection<EnforcePolicyComplianceForJobResponseJobClusterSettingsChange> jobClusterChanges) {
    this.jobClusterChanges = jobClusterChanges;
    return this;
  }

  public Collection<EnforcePolicyComplianceForJobResponseJobClusterSettingsChange>
      getJobClusterChanges() {
    return jobClusterChanges;
  }

  public EnforcePolicyComplianceResponsePb setSettings(JobSettings settings) {
    this.settings = settings;
    return this;
  }

  public JobSettings getSettings() {
    return settings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnforcePolicyComplianceResponsePb that = (EnforcePolicyComplianceResponsePb) o;
    return Objects.equals(hasChanges, that.hasChanges)
        && Objects.equals(jobClusterChanges, that.jobClusterChanges)
        && Objects.equals(settings, that.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasChanges, jobClusterChanges, settings);
  }

  @Override
  public String toString() {
    return new ToStringer(EnforcePolicyComplianceResponsePb.class)
        .add("hasChanges", hasChanges)
        .add("jobClusterChanges", jobClusterChanges)
        .add("settings", settings)
        .toString();
  }
}
