// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TableSummary {
  /** The full name of the table. */
  @JsonProperty("full_name")
  private String fullName;

  /** */
  @JsonProperty("table_type")
  private TableType tableType;

  public TableSummary setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public TableSummary setTableType(TableType tableType) {
    this.tableType = tableType;
    return this;
  }

  public TableType getTableType() {
    return tableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableSummary that = (TableSummary) o;
    return Objects.equals(fullName, that.fullName) && Objects.equals(tableType, that.tableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, tableType);
  }

  @Override
  public String toString() {
    return new ToStringer(TableSummary.class)
        .add("fullName", fullName)
        .add("tableType", tableType)
        .toString();
  }
}
