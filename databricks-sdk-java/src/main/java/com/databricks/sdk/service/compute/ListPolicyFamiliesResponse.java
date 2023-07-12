// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ListPolicyFamiliesResponse {
  /**
   * A token that can be used to get the next page of results. If not present,
   * there are no more results to show.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;
  
  /**
   * List of policy families.
   */
  @JsonProperty("policy_families")
  private Collection<PolicyFamily> policyFamilies;
  
  public ListPolicyFamiliesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }
  
  public ListPolicyFamiliesResponse setPolicyFamilies(Collection<PolicyFamily> policyFamilies) {
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
    ListPolicyFamiliesResponse that = (ListPolicyFamiliesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
    && Objects.equals(policyFamilies, that.policyFamilies)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, policyFamilies);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPolicyFamiliesResponse.class)
      .add("nextPageToken", nextPageToken)
      .add("policyFamilies", policyFamilies).toString();
  }
}
