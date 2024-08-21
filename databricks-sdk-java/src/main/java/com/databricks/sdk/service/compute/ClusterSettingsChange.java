// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents a change to the cluster settings required for the cluster to become compliant with its
 * policy.
 */
@Generated
public class ClusterSettingsChange {
  /** The field where this change would be made. */
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

  public ClusterSettingsChange setField(String field) {
    this.field = field;
    return this;
  }

  public String getField() {
    return field;
  }

  public ClusterSettingsChange setNewValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

  public String getNewValue() {
    return newValue;
  }

  public ClusterSettingsChange setPreviousValue(String previousValue) {
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
    ClusterSettingsChange that = (ClusterSettingsChange) o;
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
    return new ToStringer(ClusterSettingsChange.class)
        .add("field", field)
        .add("newValue", newValue)
        .add("previousValue", previousValue)
        .toString();
  }
}
