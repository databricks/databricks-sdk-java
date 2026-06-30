// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListDatabaseInstanceRolesResponse {
  /** List of database instance roles. */
  @JsonProperty("database_instance_roles")
  private Collection<DatabaseInstanceRole> databaseInstanceRoles;

  /** Pagination token to request the next page of instances. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDatabaseInstanceRolesResponse setDatabaseInstanceRoles(
      Collection<DatabaseInstanceRole> databaseInstanceRoles) {
    this.databaseInstanceRoles = databaseInstanceRoles;
    return this;
  }

  public Collection<DatabaseInstanceRole> getDatabaseInstanceRoles() {
    return databaseInstanceRoles;
  }

  public ListDatabaseInstanceRolesResponse setNextPageToken(String nextPageToken) {
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
    ListDatabaseInstanceRolesResponse that = (ListDatabaseInstanceRolesResponse) o;
    return Objects.equals(databaseInstanceRoles, that.databaseInstanceRoles)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstanceRoles, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseInstanceRolesResponse.class)
        .add("databaseInstanceRoles", databaseInstanceRoles)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
