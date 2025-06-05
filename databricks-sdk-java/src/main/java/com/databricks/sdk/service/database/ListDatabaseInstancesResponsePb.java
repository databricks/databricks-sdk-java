// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListDatabaseInstancesResponsePb {
  @JsonProperty("database_instances")
  private Collection<DatabaseInstance> databaseInstances;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDatabaseInstancesResponsePb setDatabaseInstances(
      Collection<DatabaseInstance> databaseInstances) {
    this.databaseInstances = databaseInstances;
    return this;
  }

  public Collection<DatabaseInstance> getDatabaseInstances() {
    return databaseInstances;
  }

  public ListDatabaseInstancesResponsePb setNextPageToken(String nextPageToken) {
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
    ListDatabaseInstancesResponsePb that = (ListDatabaseInstancesResponsePb) o;
    return Objects.equals(databaseInstances, that.databaseInstances)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstances, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseInstancesResponsePb.class)
        .add("databaseInstances", databaseInstances)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
