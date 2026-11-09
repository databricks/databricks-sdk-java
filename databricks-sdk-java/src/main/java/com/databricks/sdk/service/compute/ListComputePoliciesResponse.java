// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for listing compute policies. */
@Generated
public class ListComputePoliciesResponse {
  /** The list of compute policies. */
  @JsonProperty("compute_policies")
  private Collection<ComputePolicy> computePolicies;

  /** Token for the next page of results. Empty if no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListComputePoliciesResponse setComputePolicies(Collection<ComputePolicy> computePolicies) {
    this.computePolicies = computePolicies;
    return this;
  }

  public Collection<ComputePolicy> getComputePolicies() {
    return computePolicies;
  }

  public ListComputePoliciesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListComputePoliciesResponse that = (ListComputePoliciesResponse) o;
    return Objects.equals(computePolicies, that.computePolicies)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computePolicies, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListComputePoliciesResponse.class)
        .add("computePolicies", computePolicies)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
