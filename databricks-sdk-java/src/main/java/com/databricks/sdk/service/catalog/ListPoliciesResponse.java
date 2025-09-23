// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListPoliciesResponse {
  /**
   * Optional opaque token for continuing pagination. `page_token` should be set to this value for
   * the next request to retrieve the next page of results.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The list of retrieved policies. */
  @JsonProperty("policies")
  private Collection<PolicyInfo> policies;

  public ListPoliciesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListPoliciesResponse setPolicies(Collection<PolicyInfo> policies) {
    this.policies = policies;
    return this;
  }

  public Collection<PolicyInfo> getPolicies() {
    return policies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPoliciesResponse that = (ListPoliciesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(policies, that.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, policies);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPoliciesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("policies", policies)
        .toString();
  }
}
