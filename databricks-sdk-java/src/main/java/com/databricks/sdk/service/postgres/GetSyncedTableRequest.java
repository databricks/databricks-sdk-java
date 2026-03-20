// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetSyncedTableRequest {
  /**
   * Format: "synced_tables/{catalog}.{schema}.{table}", where (catalog, schema, table) are the
   * entity names in the Unity Catalog.
   */
  @JsonIgnore private String name;

  public GetSyncedTableRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSyncedTableRequest that = (GetSyncedTableRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSyncedTableRequest.class).add("name", name).toString();
  }
}
