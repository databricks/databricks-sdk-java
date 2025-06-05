// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class NccEgressConfigPb {
  @JsonProperty("default_rules")
  private NccEgressDefaultRules defaultRules;

  @JsonProperty("target_rules")
  private NccEgressTargetRules targetRules;

  public NccEgressConfigPb setDefaultRules(NccEgressDefaultRules defaultRules) {
    this.defaultRules = defaultRules;
    return this;
  }

  public NccEgressDefaultRules getDefaultRules() {
    return defaultRules;
  }

  public NccEgressConfigPb setTargetRules(NccEgressTargetRules targetRules) {
    this.targetRules = targetRules;
    return this;
  }

  public NccEgressTargetRules getTargetRules() {
    return targetRules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NccEgressConfigPb that = (NccEgressConfigPb) o;
    return Objects.equals(defaultRules, that.defaultRules)
        && Objects.equals(targetRules, that.targetRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultRules, targetRules);
  }

  @Override
  public String toString() {
    return new ToStringer(NccEgressConfigPb.class)
        .add("defaultRules", defaultRules)
        .add("targetRules", targetRules)
        .toString();
  }
}
