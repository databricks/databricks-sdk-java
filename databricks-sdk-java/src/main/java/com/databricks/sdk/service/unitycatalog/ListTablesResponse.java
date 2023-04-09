// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListTablesResponse {
  /** An array of table information objects. */
  @JsonProperty("tables")
  private Collection<TableInfo> tables;

  public ListTablesResponse setTables(Collection<TableInfo> tables) {
    this.tables = tables;
    return this;
  }

  public Collection<TableInfo> getTables() {
    return tables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTablesResponse that = (ListTablesResponse) o;
    return Objects.equals(tables, that.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tables);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTablesResponse.class).add("tables", tables).toString();
  }
}
