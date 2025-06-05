// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A list of policies. */
@Generated
class ListBudgetPoliciesResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("policies")
  private Collection<BudgetPolicy> policies;

  @JsonProperty("previous_page_token")
  private String previousPageToken;

  public ListBudgetPoliciesResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListBudgetPoliciesResponsePb setPolicies(Collection<BudgetPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public Collection<BudgetPolicy> getPolicies() {
    return policies;
  }

  public ListBudgetPoliciesResponsePb setPreviousPageToken(String previousPageToken) {
    this.previousPageToken = previousPageToken;
    return this;
  }

  public String getPreviousPageToken() {
    return previousPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListBudgetPoliciesResponsePb that = (ListBudgetPoliciesResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(policies, that.policies)
        && Objects.equals(previousPageToken, that.previousPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, policies, previousPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBudgetPoliciesResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("policies", policies)
        .add("previousPageToken", previousPageToken)
        .toString();
  }
}
