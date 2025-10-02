// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListDatabaseProjectsResponse {
  /** List of projects. */
  @JsonProperty("database_projects")
  private Collection<DatabaseProject> databaseProjects;

  /** Pagination token to request the next page of instances. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDatabaseProjectsResponse setDatabaseProjects(
      Collection<DatabaseProject> databaseProjects) {
    this.databaseProjects = databaseProjects;
    return this;
  }

  public Collection<DatabaseProject> getDatabaseProjects() {
    return databaseProjects;
  }

  public ListDatabaseProjectsResponse setNextPageToken(String nextPageToken) {
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
    ListDatabaseProjectsResponse that = (ListDatabaseProjectsResponse) o;
    return Objects.equals(databaseProjects, that.databaseProjects)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseProjects, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseProjectsResponse.class)
        .add("databaseProjects", databaseProjects)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
