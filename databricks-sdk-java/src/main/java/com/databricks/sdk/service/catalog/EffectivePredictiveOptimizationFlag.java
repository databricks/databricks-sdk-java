// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EffectivePredictiveOptimizationFlag {
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
  private EffectivePredictiveOptimizationFlagInheritedFromType inheritedFromType;

  /** Whether predictive optimization should be enabled for this object and objects under it. */
  @JsonProperty("value")
  private EnablePredictiveOptimization value;

  public EffectivePredictiveOptimizationFlag setInheritedFromName(String inheritedFromName) {
    this.inheritedFromName = inheritedFromName;
    return this;
  }

  public String getInheritedFromName() {
    return inheritedFromName;
  }

  public EffectivePredictiveOptimizationFlag setInheritedFromType(
      EffectivePredictiveOptimizationFlagInheritedFromType inheritedFromType) {
    this.inheritedFromType = inheritedFromType;
    return this;
  }

  public EffectivePredictiveOptimizationFlagInheritedFromType getInheritedFromType() {
    return inheritedFromType;
  }

  public EffectivePredictiveOptimizationFlag setValue(EnablePredictiveOptimization value) {
    this.value = value;
    return this;
  }

  public EnablePredictiveOptimization getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EffectivePredictiveOptimizationFlag that = (EffectivePredictiveOptimizationFlag) o;
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
    return new ToStringer(EffectivePredictiveOptimizationFlag.class)
        .add("inheritedFromName", inheritedFromName)
        .add("inheritedFromType", inheritedFromType)
        .add("value", value)
        .toString();
  }
}
