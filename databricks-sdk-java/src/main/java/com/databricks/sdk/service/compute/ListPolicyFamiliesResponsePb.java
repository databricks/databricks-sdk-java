// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListPolicyFamiliesResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("policy_families")
  private Collection<PolicyFamily> policyFamilies;

  public ListPolicyFamiliesResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListPolicyFamiliesResponsePb setPolicyFamilies(Collection<PolicyFamily> policyFamilies) {
    this.policyFamilies = policyFamilies;
    return this;
  }

  public Collection<PolicyFamily> getPolicyFamilies() {
    return policyFamilies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPolicyFamiliesResponsePb that = (ListPolicyFamiliesResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(policyFamilies, that.policyFamilies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, policyFamilies);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPolicyFamiliesResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("policyFamilies", policyFamilies)
        .toString();
  }
}
