// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListFederationPoliciesResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("policies")
  private Collection<FederationPolicy> policies;

  public ListFederationPoliciesResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListFederationPoliciesResponsePb setPolicies(Collection<FederationPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public Collection<FederationPolicy> getPolicies() {
    return policies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListFederationPoliciesResponsePb that = (ListFederationPoliciesResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(policies, that.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, policies);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFederationPoliciesResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("policies", policies)
        .toString();
  }
}
