// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateRuleSetRequest {
  /** Name of the rule set. */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("rule_set")
  private RuleSetUpdateRequest ruleSet;

  public UpdateRuleSetRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateRuleSetRequest setRuleSet(RuleSetUpdateRequest ruleSet) {
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
    UpdateRuleSetRequest that = (UpdateRuleSetRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(ruleSet, that.ruleSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ruleSet);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRuleSetRequest.class)
        .add("name", name)
        .add("ruleSet", ruleSet)
        .toString();
  }
}
