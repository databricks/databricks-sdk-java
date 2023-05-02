// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EffectiveAutoMaintenanceFlag {
  /**
   * The name of the object from which the flag was inherited. If there was no inheritance, this
   * field is left blank.
   */
  @JsonProperty("inherited_from_name")
  private String inheritedFromName;

  /**
   * The type of the object from which the flag was inherited. If there was no inheritance, this
   * field is left blank.
   */
  @JsonProperty("inherited_from_type")
  private EffectiveAutoMaintenanceFlagInheritedFromType inheritedFromType;

  /** Whether auto maintenance should be enabled for this object and objects under it. */
  @JsonProperty("value")
  private EnableAutoMaintenance value;

  public EffectiveAutoMaintenanceFlag setInheritedFromName(String inheritedFromName) {
    this.inheritedFromName = inheritedFromName;
    return this;
  }

  public String getInheritedFromName() {
    return inheritedFromName;
  }

  public EffectiveAutoMaintenanceFlag setInheritedFromType(
      EffectiveAutoMaintenanceFlagInheritedFromType inheritedFromType) {
    this.inheritedFromType = inheritedFromType;
    return this;
  }

  public EffectiveAutoMaintenanceFlagInheritedFromType getInheritedFromType() {
    return inheritedFromType;
  }

  public EffectiveAutoMaintenanceFlag setValue(EnableAutoMaintenance value) {
    this.value = value;
    return this;
  }

  public EnableAutoMaintenance getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectiveAutoMaintenanceFlag that = (EffectiveAutoMaintenanceFlag) o;
    return Objects.equals(inheritedFromName, that.inheritedFromName)
        && Objects.equals(inheritedFromType, that.inheritedFromType)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inheritedFromName, inheritedFromType, value);
  }

  @Override
  public String toString() {
    return new ToStringer(EffectiveAutoMaintenanceFlag.class)
        .add("inheritedFromName", inheritedFromName)
        .add("inheritedFromType", inheritedFromType)
        .add("value", value)
        .toString();
  }
}
