// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>EffectiveAutoMaintenanceFlag class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>inheritedFromName</code>.</p>
   *
   * @param inheritedFromName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.EffectiveAutoMaintenanceFlag} object
   */
  public EffectiveAutoMaintenanceFlag setInheritedFromName(String inheritedFromName) {
    this.inheritedFromName = inheritedFromName;
    return this;
  }

  /**
   * <p>Getter for the field <code>inheritedFromName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInheritedFromName() {
    return inheritedFromName;
  }

  /**
   * <p>Setter for the field <code>inheritedFromType</code>.</p>
   *
   * @param inheritedFromType a {@link com.databricks.sdk.service.catalog.EffectiveAutoMaintenanceFlagInheritedFromType} object
   * @return a {@link com.databricks.sdk.service.catalog.EffectiveAutoMaintenanceFlag} object
   */
  public EffectiveAutoMaintenanceFlag setInheritedFromType(
      EffectiveAutoMaintenanceFlagInheritedFromType inheritedFromType) {
    this.inheritedFromType = inheritedFromType;
    return this;
  }

  /**
   * <p>Getter for the field <code>inheritedFromType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.EffectiveAutoMaintenanceFlagInheritedFromType} object
   */
  public EffectiveAutoMaintenanceFlagInheritedFromType getInheritedFromType() {
    return inheritedFromType;
  }

  /**
   * <p>Setter for the field <code>value</code>.</p>
   *
   * @param value a {@link com.databricks.sdk.service.catalog.EnableAutoMaintenance} object
   * @return a {@link com.databricks.sdk.service.catalog.EffectiveAutoMaintenanceFlag} object
   */
  public EffectiveAutoMaintenanceFlag setValue(EnableAutoMaintenance value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Getter for the field <code>value</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.EnableAutoMaintenance} object
   */
  public EnableAutoMaintenance getValue() {
    return value;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectiveAutoMaintenanceFlag that = (EffectiveAutoMaintenanceFlag) o;
    return Objects.equals(inheritedFromName, that.inheritedFromName)
        && Objects.equals(inheritedFromType, that.inheritedFromType)
        && Objects.equals(value, that.value);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(inheritedFromName, inheritedFromType, value);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(EffectiveAutoMaintenanceFlag.class)
        .add("inheritedFromName", inheritedFromName)
        .add("inheritedFromType", inheritedFromType)
        .add("value", value)
        .toString();
  }
}
