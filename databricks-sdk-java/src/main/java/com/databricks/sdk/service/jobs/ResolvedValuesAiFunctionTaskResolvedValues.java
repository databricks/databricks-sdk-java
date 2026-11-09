// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Resolved values for an AI Function task's Delta table input. */
@Generated
public class ResolvedValuesAiFunctionTaskResolvedValues {
  /**
   * The Delta table source with any upstream-task references (such as
   * `{{tasks.<task_key>.values.output_table_name}}`) in the table name replaced by concrete values
   * before the run.
   */
  @JsonProperty("delta_table")
  private DeltaTableSource deltaTable;

  public ResolvedValuesAiFunctionTaskResolvedValues setDeltaTable(DeltaTableSource deltaTable) {
    this.deltaTable = deltaTable;
    return this;
  }

  public DeltaTableSource getDeltaTable() {
    return deltaTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResolvedValuesAiFunctionTaskResolvedValues that =
        (ResolvedValuesAiFunctionTaskResolvedValues) o;
    return Objects.equals(deltaTable, that.deltaTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaTable);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedValuesAiFunctionTaskResolvedValues.class)
        .add("deltaTable", deltaTable)
        .toString();
  }
}
