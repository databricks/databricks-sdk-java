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
class ClusterSettingsChangePb {
  @JsonProperty("field")
  private String field;

  @JsonProperty("new_value")
  private String newValue;

  @JsonProperty("previous_value")
  private String previousValue;

  public ClusterSettingsChangePb setField(String field) {
    this.field = field;
    return this;
  }

  public String getField() {
    return field;
  }

  public ClusterSettingsChangePb setNewValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

  public String getNewValue() {
    return newValue;
  }

  public ClusterSettingsChangePb setPreviousValue(String previousValue) {
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
    ClusterSettingsChangePb that = (ClusterSettingsChangePb) o;
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
    return new ToStringer(ClusterSettingsChangePb.class)
        .add("field", field)
        .add("newValue", newValue)
        .add("previousValue", previousValue)
        .toString();
  }
}
