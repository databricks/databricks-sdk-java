// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** An optional set of health rules that can be defined for this job. */
@Generated
class JobsHealthRulesPb {
  @JsonProperty("rules")
  private Collection<JobsHealthRule> rules;

  public JobsHealthRulesPb setRules(Collection<JobsHealthRule> rules) {
    this.rules = rules;
    return this;
  }

  public Collection<JobsHealthRule> getRules() {
    return rules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobsHealthRulesPb that = (JobsHealthRulesPb) o;
    return Objects.equals(rules, that.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }

  @Override
  public String toString() {
    return new ToStringer(JobsHealthRulesPb.class).add("rules", rules).toString();
  }
}
