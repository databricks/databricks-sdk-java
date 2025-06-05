// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListPoliciesResponsePb {
  @JsonProperty("policies")
  private Collection<Policy> policies;

  public ListPoliciesResponsePb setPolicies(Collection<Policy> policies) {
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
    ListPoliciesResponsePb that = (ListPoliciesResponsePb) o;
    return Objects.equals(policies, that.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policies);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPoliciesResponsePb.class).add("policies", policies).toString();
  }
}
