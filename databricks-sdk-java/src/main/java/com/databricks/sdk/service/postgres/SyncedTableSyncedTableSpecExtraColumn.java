// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** An extra PostgreSQL column to add to the synced table. */
@Generated
public class SyncedTableSyncedTableSpecExtraColumn {
  /** Name of the column. */
  @JsonProperty("column_name")
  private String columnName;

  /** PostgreSQL type of the column, for example "tsvector" or "vector(1024)". */
  @JsonProperty("column_type")
  private String columnType;

  /**
   * SQL expression used to compute the column's value, for example "to_tsvector('english',
   * content)".
   */
  @JsonProperty("compute")
  private String compute;

  /** */
  @JsonProperty("maintenance")
  private SyncedTableSyncedTableSpecExtraColumnMaintenance maintenance;

  public SyncedTableSyncedTableSpecExtraColumn setColumnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  public String getColumnName() {
    return columnName;
  }

  public SyncedTableSyncedTableSpecExtraColumn setColumnType(String columnType) {
    this.columnType = columnType;
    return this;
  }

  public String getColumnType() {
    return columnType;
  }

  public SyncedTableSyncedTableSpecExtraColumn setCompute(String compute) {
    this.compute = compute;
    return this;
  }

  public String getCompute() {
    return compute;
  }

  public SyncedTableSyncedTableSpecExtraColumn setMaintenance(
      SyncedTableSyncedTableSpecExtraColumnMaintenance maintenance) {
    this.maintenance = maintenance;
    return this;
  }

  public SyncedTableSyncedTableSpecExtraColumnMaintenance getMaintenance() {
    return maintenance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableSyncedTableSpecExtraColumn that = (SyncedTableSyncedTableSpecExtraColumn) o;
    return Objects.equals(columnName, that.columnName)
        && Objects.equals(columnType, that.columnType)
        && Objects.equals(compute, that.compute)
        && Objects.equals(maintenance, that.maintenance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, columnType, compute, maintenance);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableSyncedTableSpecExtraColumn.class)
        .add("columnName", columnName)
        .add("columnType", columnType)
        .add("compute", compute)
        .add("maintenance", maintenance)
        .toString();
  }
}
