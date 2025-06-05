// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EffectivePredictiveOptimizationFlagPb {
  @JsonProperty("inherited_from_name")
  private String inheritedFromName;

  @JsonProperty("inherited_from_type")
  private EffectivePredictiveOptimizationFlagInheritedFromType inheritedFromType;

  @JsonProperty("value")
  private EnablePredictiveOptimization value;

  public EffectivePredictiveOptimizationFlagPb setInheritedFromName(String inheritedFromName) {
    this.inheritedFromName = inheritedFromName;
    return this;
  }

  public String getInheritedFromName() {
    return inheritedFromName;
  }

  public EffectivePredictiveOptimizationFlagPb setInheritedFromType(
      EffectivePredictiveOptimizationFlagInheritedFromType inheritedFromType) {
    this.inheritedFromType = inheritedFromType;
    return this;
  }

  public EffectivePredictiveOptimizationFlagInheritedFromType getInheritedFromType() {
    return inheritedFromType;
  }

  public EffectivePredictiveOptimizationFlagPb setValue(EnablePredictiveOptimization value) {
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
    EffectivePredictiveOptimizationFlagPb that = (EffectivePredictiveOptimizationFlagPb) o;
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
    return new ToStringer(EffectivePredictiveOptimizationFlagPb.class)
        .add("inheritedFromName", inheritedFromName)
        .add("inheritedFromType", inheritedFromType)
        .add("value", value)
        .toString();
  }
}
