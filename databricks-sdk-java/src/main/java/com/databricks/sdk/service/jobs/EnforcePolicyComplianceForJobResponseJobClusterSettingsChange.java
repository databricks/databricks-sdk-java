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
public class EnforcePolicyComplianceForJobResponseJobClusterSettingsChange {
  /** The field where this change would be made, prepended with the job cluster key. */
  @JsonProperty("field")
  private String field;

  /**
   * The new value of this field after enforcing policy compliance (either a number, a boolean, or a
   * string) converted to a string. This is intended to be read by a human. The typed new value of
   * this field can be retrieved by reading the settings field in the API response.
   */
  @JsonProperty("new_value")
  private String newValue;

  /**
   * The previous value of this field before enforcing policy compliance (either a number, a
   * boolean, or a string) converted to a string. This is intended to be read by a human. The type
   * of the field can be retrieved by reading the settings field in the API response.
   */
  @JsonProperty("previous_value")
  private String previousValue;

  public EnforcePolicyComplianceForJobResponseJobClusterSettingsChange setField(String field) {
    this.field = field;
    return this;
  }

  public String getField() {
    return field;
  }

  public EnforcePolicyComplianceForJobResponseJobClusterSettingsChange setNewValue(
      String newValue) {
    this.newValue = newValue;
    return this;
  }

  public String getNewValue() {
    return newValue;
  }

  public EnforcePolicyComplianceForJobResponseJobClusterSettingsChange setPreviousValue(
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
    EnforcePolicyComplianceForJobResponseJobClusterSettingsChange that =
        (EnforcePolicyComplianceForJobResponseJobClusterSettingsChange) o;
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
    return new ToStringer(EnforcePolicyComplianceForJobResponseJobClusterSettingsChange.class)
        .add("field", field)
        .add("newValue", newValue)
        .add("previousValue", previousValue)
        .toString();
  }
}
