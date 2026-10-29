// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A Unity Catalog Delta table input source. The function is applied to each row. */
@Generated
public class DeltaTableSource {
  /** Name of the column holding the content the function is applied to. */
  @JsonProperty("input_column")
  private String inputColumn;

  /**
   * Columns that together identify a row across incremental runs, so results can be matched back to
   * their source rows. When unset, the task derives an implicit key from Delta row tracking. If row
   * tracking is also disabled there is no stable key, so each run reprocesses the entire source (a
   * full refresh) rather than only the changed rows; set a key column or enable row tracking to
   * keep runs incremental.
   */
  @JsonProperty("merge_key_columns")
  private Collection<String> mergeKeyColumns;

  /** Fully qualified three-part name of the source table (catalog.schema.table). */
  @JsonProperty("table_name")
  private String tableName;

  public DeltaTableSource setInputColumn(String inputColumn) {
    this.inputColumn = inputColumn;
    return this;
  }

  public String getInputColumn() {
    return inputColumn;
  }

  public DeltaTableSource setMergeKeyColumns(Collection<String> mergeKeyColumns) {
    this.mergeKeyColumns = mergeKeyColumns;
    return this;
  }

  public Collection<String> getMergeKeyColumns() {
    return mergeKeyColumns;
  }

  public DeltaTableSource setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaTableSource that = (DeltaTableSource) o;
    return Objects.equals(inputColumn, that.inputColumn)
        && Objects.equals(mergeKeyColumns, that.mergeKeyColumns)
        && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputColumn, mergeKeyColumns, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaTableSource.class)
        .add("inputColumn", inputColumn)
        .add("mergeKeyColumns", mergeKeyColumns)
        .add("tableName", tableName)
        .toString();
  }
}
