// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateRuleRequest {
  /**
   * The rule to create. Server-assigned fields (`name`, `rule_id`, timestamps, `etag`, …) are
   * ignored on the request.
   */
  @JsonProperty("rule")
  private Rule rule;

  public CreateRuleRequest setRule(Rule rule) {
    this.rule = rule;
    return this;
  }

  public Rule getRule() {
    return rule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateRuleRequest that = (CreateRuleRequest) o;
    return Objects.equals(rule, that.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRuleRequest.class).add("rule", rule).toString();
  }
}
