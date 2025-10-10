// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListDatabaseBranchesResponse {
  /** List of branches. */
  @JsonProperty("database_branches")
  private Collection<DatabaseBranch> databaseBranches;

  /** Pagination token to request the next page of instances. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDatabaseBranchesResponse setDatabaseBranches(
      Collection<DatabaseBranch> databaseBranches) {
    this.databaseBranches = databaseBranches;
    return this;
  }

  public Collection<DatabaseBranch> getDatabaseBranches() {
    return databaseBranches;
  }

  public ListDatabaseBranchesResponse setNextPageToken(String nextPageToken) {
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
    ListDatabaseBranchesResponse that = (ListDatabaseBranchesResponse) o;
    return Objects.equals(databaseBranches, that.databaseBranches)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseBranches, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseBranchesResponse.class)
        .add("databaseBranches", databaseBranches)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
