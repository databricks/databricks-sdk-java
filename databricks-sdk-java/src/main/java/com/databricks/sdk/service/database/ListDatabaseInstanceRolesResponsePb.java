// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListDatabaseInstanceRolesResponsePb {
  @JsonProperty("database_instance_roles")
  private Collection<DatabaseInstanceRole> databaseInstanceRoles;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDatabaseInstanceRolesResponsePb setDatabaseInstanceRoles(
      Collection<DatabaseInstanceRole> databaseInstanceRoles) {
    this.databaseInstanceRoles = databaseInstanceRoles;
    return this;
  }

  public Collection<DatabaseInstanceRole> getDatabaseInstanceRoles() {
    return databaseInstanceRoles;
  }

  public ListDatabaseInstanceRolesResponsePb setNextPageToken(String nextPageToken) {
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
    ListDatabaseInstanceRolesResponsePb that = (ListDatabaseInstanceRolesResponsePb) o;
    return Objects.equals(databaseInstanceRoles, that.databaseInstanceRoles)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstanceRoles, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseInstanceRolesResponsePb.class)
        .add("databaseInstanceRoles", databaseInstanceRoles)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
