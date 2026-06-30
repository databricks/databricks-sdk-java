// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Overrides the default Delta-to-PostgreSQL type mapping for a single column. */
@Generated
public class SyncedTableSyncedTableSpecTypeOverride {
  /** Name of the source column whose target PostgreSQL type should be overridden. */
  @JsonProperty("column_name")
  private String columnName;

  /** PostgreSQL-specific target type to use for the column. */
  @JsonProperty("pg_type")
  private SyncedTableSyncedTableSpecPgSpecificType pgType;

  /**
   * Size parameter for the target type. Required when pg_type is PG_SPECIFIC_TYPE_VECTOR (specifies
   * the vector dimension, e.g., 1024).
   */
  @JsonProperty("size")
  private Long size;

  public SyncedTableSyncedTableSpecTypeOverride setColumnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  public String getColumnName() {
    return columnName;
  }

  public SyncedTableSyncedTableSpecTypeOverride setPgType(
      SyncedTableSyncedTableSpecPgSpecificType pgType) {
    this.pgType = pgType;
    return this;
  }

  public SyncedTableSyncedTableSpecPgSpecificType getPgType() {
    return pgType;
  }

  public SyncedTableSyncedTableSpecTypeOverride setSize(Long size) {
    this.size = size;
    return this;
  }

  public Long getSize() {
    return size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableSyncedTableSpecTypeOverride that = (SyncedTableSyncedTableSpecTypeOverride) o;
    return Objects.equals(columnName, that.columnName)
        && Objects.equals(pgType, that.pgType)
        && Objects.equals(size, that.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, pgType, size);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableSyncedTableSpecTypeOverride.class)
        .add("columnName", columnName)
        .add("pgType", pgType)
        .add("size", size)
        .toString();
  }
}
