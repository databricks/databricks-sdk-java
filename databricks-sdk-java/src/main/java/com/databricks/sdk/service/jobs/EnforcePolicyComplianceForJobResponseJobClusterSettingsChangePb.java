// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents a change to the job cluster's settings that would be required for the job clusters to
 * become compliant with their policies.
 */
@Generated
class EnforcePolicyComplianceForJobResponseJobClusterSettingsChangePb {
  @JsonProperty("field")
  private String field;

  @JsonProperty("new_value")
  private String newValue;

  @JsonProperty("previous_value")
  private String previousValue;

  public EnforcePolicyComplianceForJobResponseJobClusterSettingsChangePb setField(String field) {
    this.field = field;
    return this;
  }

  public String getField() {
    return field;
  }

  public EnforcePolicyComplianceForJobResponseJobClusterSettingsChangePb setNewValue(
      String newValue) {
    this.newValue = newValue;
    return this;
  }

  public String getNewValue() {
    return newValue;
  }

  public EnforcePolicyComplianceForJobResponseJobClusterSettingsChangePb setPreviousValue(
      String previousValue) {
    this.previousValue = previousValue;
    return this;
  }

  public String getPreviousValue() {
    return previousValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnforcePolicyComplianceForJobResponseJobClusterSettingsChangePb that =
        (EnforcePolicyComplianceForJobResponseJobClusterSettingsChangePb) o;
    return Objects.equals(field, that.field)
        && Objects.equals(newValue, that.newValue)
        && Objects.equals(previousValue, that.previousValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, newValue, previousValue);
  }

  @Override
  public String toString() {
    return new ToStringer(EnforcePolicyComplianceForJobResponseJobClusterSettingsChangePb.class)
        .add("field", field)
        .add("newValue", newValue)
        .add("previousValue", previousValue)
        .toString();
  }
}
