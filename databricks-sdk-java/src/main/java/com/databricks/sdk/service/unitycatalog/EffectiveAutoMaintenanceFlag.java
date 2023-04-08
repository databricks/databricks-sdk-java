// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
