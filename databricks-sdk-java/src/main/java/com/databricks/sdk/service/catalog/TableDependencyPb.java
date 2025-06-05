// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A table that is dependent on a SQL object. */
@Generated
class TableDependencyPb {
  @JsonProperty("table_full_name")
  private String tableFullName;

  public TableDependencyPb setTableFullName(String tableFullName) {
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
    TableDependencyPb that = (TableDependencyPb) o;
    return Objects.equals(tableFullName, that.tableFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableFullName);
  }

  @Override
  public String toString() {
    return new ToStringer(TableDependencyPb.class).add("tableFullName", tableFullName).toString();
  }
}
