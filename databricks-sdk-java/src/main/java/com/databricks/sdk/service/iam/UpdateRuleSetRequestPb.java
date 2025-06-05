// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateRuleSetRequestPb {
  @JsonProperty("name")
  private String name;

  @JsonProperty("rule_set")
  private RuleSetUpdateRequest ruleSet;

  public UpdateRuleSetRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateRuleSetRequestPb setRuleSet(RuleSetUpdateRequest ruleSet) {
    this.ruleSet = ruleSet;
    return this;
  }

  public RuleSetUpdateRequest getRuleSet() {
    return ruleSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRuleSetRequestPb that = (UpdateRuleSetRequestPb) o;
    return Objects.equals(name, that.name) && Objects.equals(ruleSet, that.ruleSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ruleSet);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRuleSetRequestPb.class)
        .add("name", name)
        .add("ruleSet", ruleSet)
        .toString();
  }
}
