// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CleanRoomAssetTable {
  /** The metadata information of the columns in the table */
  @JsonProperty("columns")
  private Collection<com.databricks.sdk.service.catalog.ColumnInfo> columns;

  public CleanRoomAssetTable setColumns(
      Collection<com.databricks.sdk.service.catalog.ColumnInfo> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<com.databricks.sdk.service.catalog.ColumnInfo> getColumns() {
    return columns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetTable that = (CleanRoomAssetTable) o;
    return Objects.equals(columns, that.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetTable.class).add("columns", columns).toString();
  }
}
