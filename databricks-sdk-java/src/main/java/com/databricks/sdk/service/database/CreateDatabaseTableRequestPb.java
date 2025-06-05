// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create a Database Table */
@Generated
class CreateDatabaseTableRequestPb {
  @JsonProperty("table")
  private DatabaseTable table;

  public CreateDatabaseTableRequestPb setTable(DatabaseTable table) {
    this.table = table;
    return this;
  }

  public DatabaseTable getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDatabaseTableRequestPb that = (CreateDatabaseTableRequestPb) o;
    return Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(table);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseTableRequestPb.class).add("table", table).toString();
  }
}
