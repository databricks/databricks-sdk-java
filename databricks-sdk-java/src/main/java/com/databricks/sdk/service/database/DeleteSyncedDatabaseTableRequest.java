// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteSyncedDatabaseTableRequest {
  /** Specifies the synced table by its full three-part (catalog, schema, table) name. */
  @JsonIgnore private String name;

  /**
   * When true, the Postgres table is also dropped from the database. When false, the synced table
   * is unregistered from Unity Catalog and its pipeline stops syncing it, but the Postgres table
   * and its data are kept.
   */
  @JsonIgnore
  @QueryParam("purge_data")
  private Boolean purgeData;

  public DeleteSyncedDatabaseTableRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteSyncedDatabaseTableRequest setPurgeData(Boolean purgeData) {
    this.purgeData = purgeData;
    return this;
  }

  public Boolean getPurgeData() {
    return purgeData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteSyncedDatabaseTableRequest that = (DeleteSyncedDatabaseTableRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(purgeData, that.purgeData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, purgeData);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSyncedDatabaseTableRequest.class)
        .add("name", name)
        .add("purgeData", purgeData)
        .toString();
  }
}
