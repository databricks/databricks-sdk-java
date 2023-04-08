// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A table that is dependent on a SQL object. */
public class TableDependency {
  /**
   * Full name of the dependent table, in the form of
   * __catalog_name__.__schema_name__.__table_name__.
   */
  @JsonProperty("table_full_name")
  private String tableFullName;

  public TableDependency setTableFullName(String tableFullName) {
    this.tableFullName = tableFullName;
    return this;
  }

  public String getTableFullName() {
    return tableFullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableDependency that = (TableDependency) o;
    return Objects.equals(tableFullName, that.tableFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableFullName);
  }

  @Override
  public String toString() {
    return new ToStringer(TableDependency.class).add("tableFullName", tableFullName).toString();
  }
}
