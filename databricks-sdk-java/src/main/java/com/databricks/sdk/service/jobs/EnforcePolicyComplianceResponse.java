// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class EnforcePolicyComplianceResponse {
  /**
   * Whether any changes have been made to the job cluster settings for the job to become compliant
   * with its policies.
   */
  @JsonProperty("has_changes")
  private Boolean hasChanges;

  /**
   * A list of job cluster changes that have been made to the job’s cluster settings in order for
   * all job clusters to become compliant with their policies.
   */
  @JsonProperty("job_cluster_changes")
  private Collection<EnforcePolicyComplianceForJobResponseJobClusterSettingsChange>
      jobClusterChanges;

  /**
   * Updated job settings after policy enforcement. Policy enforcement only applies to job clusters
   * that are created when running the job (which are specified in new_cluster) and does not apply
   * to existing all-purpose clusters. Updated job settings are derived by applying policy default
   * values to the existing job clusters in order to satisfy policy requirements.
   */
  @JsonProperty("settings")
  private JobSettings settings;

  public EnforcePolicyComplianceResponse setHasChanges(Boolean hasChanges) {
    this.hasChanges = hasChanges;
    return this;
  }

  public Boolean getHasChanges() {
    return hasChanges;
  }

  public EnforcePolicyComplianceResponse setJobClusterChanges(
      Collection<EnforcePolicyComplianceForJobResponseJobClusterSettingsChange> jobClusterChanges) {
    this.jobClusterChanges = jobClusterChanges;
    return this;
  }

  public Collection<EnforcePolicyComplianceForJobResponseJobClusterSettingsChange>
      getJobClusterChanges() {
    return jobClusterChanges;
  }

  public EnforcePolicyComplianceResponse setSettings(JobSettings settings) {
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
    EnforcePolicyComplianceResponse that = (EnforcePolicyComplianceResponse) o;
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
    return new ToStringer(EnforcePolicyComplianceResponse.class)
        .add("hasChanges", hasChanges)
        .add("jobClusterChanges", jobClusterChanges)
        .add("settings", settings)
        .toString();
  }
}
