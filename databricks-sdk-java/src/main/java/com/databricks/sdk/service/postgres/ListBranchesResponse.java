// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListBranchesResponse {
  /** List of branches. */
  @JsonProperty("branches")
  private Collection<Branch> branches;

  /** Pagination token to request the next page of branches. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListBranchesResponse setBranches(Collection<Branch> branches) {
    this.branches = branches;
    return this;
  }

  public Collection<Branch> getBranches() {
    return branches;
  }

  public ListBranchesResponse setNextPageToken(String nextPageToken) {
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
    ListBranchesResponse that = (ListBranchesResponse) o;
    return Objects.equals(branches, that.branches)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branches, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBranchesResponse.class)
        .add("branches", branches)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
