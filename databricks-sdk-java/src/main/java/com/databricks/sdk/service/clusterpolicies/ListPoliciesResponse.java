// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListPoliciesResponse {
  /** List of policies. */
  @JsonProperty("policies")
  private Collection<Policy> policies;

  public ListPoliciesResponse setPolicies(Collection<Policy> policies) {
    this.policies = policies;
    return this;
  }

  public Collection<Policy> getPolicies() {
    return policies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPoliciesResponse that = (ListPoliciesResponse) o;
    return Objects.equals(policies, that.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policies);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPoliciesResponse.class).add("policies", policies).toString();
  }
}
