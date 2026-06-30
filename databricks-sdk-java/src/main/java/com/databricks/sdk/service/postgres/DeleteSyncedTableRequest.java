// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteSyncedTableRequest {
  /**
   * The Full resource name of the synced table, of the format
   * "synced_tables/{catalog}.{schema}.{table}", where (catalog, schema, table) are the UC entity
   * names.
   */
  @JsonIgnore private String name;

  public DeleteSyncedTableRequest setName(String name) {
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
    DeleteSyncedTableRequest that = (DeleteSyncedTableRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSyncedTableRequest.class).add("name", name).toString();
  }
}
